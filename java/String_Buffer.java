class String_Buffer{
    public static void main(String[] args) {
        StringBuffer n=new StringBuffer("");

        n.append("hello");
        System.out.println(n);
        System.out.println(n.delete(1, 2));
        System.out.println(n.reverse());
        System.out.println(n.replace(1, 2, "pranay"));
        System.out.println(n.append("helloe worlds good to see you"));
        System.out.println(n.capacity());
        System.out.println(n.insert(2, "google"));
        
    }
    
}