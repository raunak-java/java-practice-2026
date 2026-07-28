class Demosleep extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1 sec pause
            } catch(Exception e) {}
        }
    }

    public static void main(String[] args) {
        Demosleep t1 = new Demosleep();
        t1.start();
    }
}
