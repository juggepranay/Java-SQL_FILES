



class details {
  private String email;
  private String password;


  public void setEmail(String email){
    this.email=email;
  }
  public String getEmail(){
    return email;
  }

  public void setPassword(String password){
    this.password=password;
  }
  public String getPassword(){
    return password;
  }

}



class encapsulation{
    public static void main(String[] args) {
        details d=new details();
        d.setEmail("juggepranay456@gmail.com");
        d.getEmail();
        d.setPassword("$hello123");
        System.out.println(d.getEmail());
        System.out.println(d.getPassword());
        a obj=new a();



    }
}