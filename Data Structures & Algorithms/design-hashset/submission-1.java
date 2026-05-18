class MyHashSet {

    int[] hash;
    int count;

    public MyHashSet() {
        hash = new int[1000000];
        count = 0;
    }
    
    public void add(int key) {
        if(!contains(key)){
            hash[count++] = key;
        }
    }
    
    public void remove(int key) {
        int temp=-1;
        boolean t=false;
        for(int i=0;i<count;i++){
            if(hash[i]==key)
            {
                temp = i;
                t=true;
                break;
            }
        }
        if(t){
            for(int i=temp;i<count;i++){
                
                hash[i]=hash[i+1];
                   
            }
            hash[count-1]=-1;
            count--;
        }
    }
    
    public boolean contains(int key) {

        for(int i=0;i<count;i++){
            if(hash[i] == key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */