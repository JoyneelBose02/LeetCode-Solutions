//Leetcode 706
//Design HashMap;
class MyHashMap {
    int[] arr;
    public MyHashMap() {
        arr = new int[1000001];
    }
    
    public void put(int key, int value) {
        arr[key] = value+1;
    }
    
    public int get(int key) {
        if(arr[key] == 0){
            return -1;
        }
        return arr[key] - 1;
    }
    
    public void remove(int key) {
        arr[key] = 0;
    }
}
