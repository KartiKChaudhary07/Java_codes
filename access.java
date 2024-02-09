class MyEmployee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int n) {
        this.id = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public static class access{
        public static void main(String[] args) {
            MyEmployee kartik = new MyEmployee();
            kartik.setName("kartik");
            kartik.setId(32);
            System.out.println(kartik.getName());
            System.out.println(kartik.getId());
        }
    }
}