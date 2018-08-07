package Practice2.practice21;
 class Man extends Human implements iTalk  {
     public Man() {

     }
      @Override
       void sleep(){
        System.out.println("I sleep some more");

    }

    public void talk(){
        System.out.println("I talk");
    }


}

