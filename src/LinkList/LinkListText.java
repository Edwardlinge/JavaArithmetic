package LinkList;

/**
 * 链表测试
 * Created by ozc on 2018/3/27.
 *
 * @author ozc
 * @version 1.0
 */
public class LinkListText {


    //头节点
    private static Node head = new Node();


    public static void main(String[] args) {

        System.out.println("公众号：Java3y--------增加节点---------");

        addData(3);
        addData(4);
        addData(5);
        addData(6);
        traverse(head);

        System.out.println("公众号：Java3y--------增加节点---------");

        System.out.println("公众号：Java3y--------查看长度---------");

        System.out.println(linkListLength(head));
        System.out.println("公众号：Java3y--------查看长度---------");

        System.out.println("公众号：Java3y--------插入节点---------");

        insertNode(head, 1, 0);

        traverse(head);

        System.out.println("公众号：Java3y--------插入节点---------");

        System.out.println("公众号：Java3y--------删除节点---------");
        deleteNode(head, 1);

        traverse(head);
        System.out.println("公众号：Java3y--------删除节点---------");

    }

    /**
     * 遍历链表
     *
     * @param head 头节点
     */
    public static void traverse(Node head) {


        //临时节点，从首节点开始
        Node temp = head.next;

        while (temp != null) {

            System.out.println("关注公众号Java3y：" + temp.data);

            //继续下一个
            temp = temp.next;
        }
    }


    /**
     * 向添加插入数据
     *
     * @param value 要添加的数据
     */
    public static void addData(int value) {

        //初始化要加入的节点
        Node newNode = new Node(value);

        //临时节点(head我已经初始化了)
        Node temp = head;


        // 找到尾节点
        while (temp.next != null) {
            temp = temp.next;
        }

        // 已经包括了头节点.next为null的情况了～
        temp.next = newNode;

    }

    /**
     * 获取链表的长度
     *
     * @param head 头指针
     */
    public static int linkListLength(Node head) {

        int length = 0;

        //临时节点，从首节点开始
        Node temp = head.next;

        // 找到尾节点
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        return length;
    }

    /**
     * 插入节点
     *
     * @param head  头指针
     * @param index 要插入的位置
     * @param value 要插入的值
     */
    public static void insertNode(Node head, int index, int value) {


        //首先需要判断指定位置是否合法，
        if (index < 1 || index > linkListLength(head) + 1) {
            System.out.println("插入位置不合法。");
            return;
        }

        //临时节点，从头节点开始
        Node temp = head;

        //记录遍历的当前位置
        int currentPos = 0;

        //初始化要插入的节点
        Node insertNode = new Node(value);

        while (temp.next != null) {

            //找到上一个节点的位置了
            if ((index - 1) == currentPos) {

                //temp表示的是上一个节点

                //将原本由上一个节点的指向交由插入的节点来指向
                insertNode.next = temp.next;

                //将上一个节点的指针域指向要插入的节点
                temp.next = insertNode;

                return;

            }
            currentPos++;
            temp = temp.next;
        }

    }


    /**
     * 根据位置删除节点
     *
     * @param head  头指针
     * @param index 要删除的位置
     */
    public static void deleteNode(Node head, int index) {


        //首先需要判断指定位置是否合法，
        if (index < 1 || index > linkListLength(head) + 1) {
            System.out.println("删除位置不合法。");
            return;
        }

        //临时节点，从头节点开始
        Node temp = head;

        //记录遍历的当前位置
        int currentPos = 0;


        while (temp.next != null) {

            //找到上一个节点的位置了
            if ((index - 1) == currentPos) {

                //temp表示的是上一个节点

                //temp.next表示的是想要删除的节点

                //将想要删除的节点存储一下
                Node deleteNode = temp.next;

                //想要删除节点的下一个节点交由上一个节点来控制
                temp.next = deleteNode.next;


                //Java会回收它，设置不设置为null应该没多大意义了(个人觉得,如果不对请指出哦～)
                //deleteNode = null;

                return;

            }
            currentPos++;
            temp = temp.next;
        }
    }


    /**
     * 对链表进行排序
     *
     * @param head
     * @param length 链表长度
     */
    public static void sortLinkList(Node head, int length) {


    }


}
