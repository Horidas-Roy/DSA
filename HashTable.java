

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets; //capacity
    private int size; //number of key value pair in HashTable

    public HashTable(){
        this(10);//default capacity
    }

    public HashTable(int capacity){
           this.numOfBuckets = capacity;
           this.buckets = new HashNode[capacity];
           this.size = 0;
    }

    private class HashNode{
        private Integer key; // can be generic
        private String value; //can be generic
        private HashNode next; // reference to the next hashNode

        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void put(Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("Key or Value is null");
        }
        
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
    }

    public int getBucketIndex(int key){
        return key % numOfBuckets;
    }

    public String get(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null ) {
            if(head.key.equals(key)){
                return (head.value);
            }
            head = head.next;
        }
        return null;
    }
    public String remove(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;
        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head == null){
            return null;
        }
        size--;
        if(previous != null){
            previous.next = head.next;
        }else{
            buckets[bucketIndex] = head.next;
        }
        return head.value;
    }

    public static void main(String[] args) {
         HashTable table = new HashTable(10);
         table.put(105, "Tom");
         table.put(21, "Sana");
         System.err.println(table.size());
         System.out.println(table.get(105));
         System.out.println(table.get(10));
         System.out.println("remove: "+table.remove(105));
    }
}
