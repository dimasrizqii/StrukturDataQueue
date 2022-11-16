public class Queue {
    int max;
    int size;
    int front;
    int rear;
    int Q[];

    Queue(int n){
        max = n;
        Create();
    }

    void Create(){
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean IsEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    boolean IsFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }

    void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen Terdepan : " + Q[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.println(Q[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue Masih Kosong");
        }
    }

    void enqueue(int data){
        if(IsFull()){
            System.out.println("Queue Sudah Penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max-1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    int dequeue(){
        int data = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            data = Q[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
}