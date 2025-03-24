package DataStructure;

public class LinkedListTest {

    private Node head; //
    private Node tail; //
    private int size = 0; // 

    public class Node {
        public Object data; // 데이터가 저장될 필드
        public Node next; // 다음 노드를 가리키는 필드
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

    }

    @Override
    public String toString() {
        // 노드가 없다면 []를 리턴한다.
        if(head == null){
            return "[]";
        }       
        // 탐색을 시작합니다.
        Node temp = head;
        String str = "[";
        // 다음 노드가 없을 때까지 반복문을 실행
        // 마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외된다.
        while(temp.next != null){
            str += temp.data + ",";
            temp = temp.next;
        }
        // 마지막 노드를 출력결과에 포함시킵니다.
        str += temp.data;
        return str+"]";
    }

    public void addFirst(Object input) {
        // 노드 생성
        Node temp = new Node(input);
        // 새로운 노드의 다음 노드로 헤드를 지정한다.
        temp.next = head;
        // 헤드로 새로운 노드를 지정합니다.
        head = temp;
        size++;
        if(head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node temp = new Node(input);
        // 리스트의 노드가 없다면 첫 번째 노드를 추가하는 메소드 사용 
        if(size == 0) {
            addFirst(input);
        }else {
            tail.next = temp; // 마지막 노드의 다음 노드로 생성한 노드를 지정한다.
            tail = temp; // 마지막 노드를 갱신한다.
            size++; // size를 증가
        } 
    }
    public void add(int k, Object input) {
        if(k==0) {
            addFirst(input);
        } else {
            Node temp1 = head;
            // temp1
            for(int i=0; i<k-1; i++) {
                temp1 = temp1.next;
            }
            
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;

            if(newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListTest numbers = new LinkedListTest();
        numbers.addFirst(10);
        numbers.addFirst(20);
        numbers.addFirst(30);
        numbers.addFirst(40);
        numbers.add(2, 25);
        
        System.out.println("numbers" + numbers.toString());
    }
    
}
