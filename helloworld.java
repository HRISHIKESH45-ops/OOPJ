public class helloworld
{
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        System.out.println("hello java");
        System.out.println("hello my name is hrishikesh");
        String name="NAHIBATAUNGA";
        int a=10;
        int b=90;
        int c=a+b;
        System.out.println(a);
        System.out.println(c);
        System.out.println(name);
        System.out.println(name.length());
        //string...its immutable in java...you have to make a new one...
        String friend=new String("NOBODY");//it always take a new one so its not compulsory...
        System.out.println(friend);
        //concatenation...joining two strings
        String name1=name+" "+friend;
        System.out.println(name1);
        System.out.println(name+" "+friend);
        //charAt
        System.out.println(friend.charAt(1));//basically to find the particular charater by giving its index...
        System.out.println(friend.length());//its gives its length...
        String friend2=friend.replace('D', 'O');
        System.out.println(friend2);
        System.out.println(friend.substring(2,6));

    }
}