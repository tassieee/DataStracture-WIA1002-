public class W_1and2_L1 {

    public static void main(String[] args) {
        fan myfan = new fan();
        fan myfan2 =new fan();
        
        myfan.setSpeed(fan.FAST);
        myfan.setRadius(10);
        myfan.setColor("Yellow");
        myfan.setOn(true);
        
        myfan2.setSpeed(fan.MEDIUM);
        myfan2.setRadius(5);
        myfan2.setColor("BLUE");
        myfan2.setOn(false);
        
        
        System.out.println(myfan.toString());
        System.out.println(myfan2.toString());
        
        
    }

    public static class fan {
        // CONSTANTS
        int SLOW = 1;
       static  int MEDIUM = 2;
        static int FAST = 3; // {Capital letter value can't be changed}

        // DATA FIELD
        private int speed;
        private boolean on;
        private double radius;
        String color;

        @Override
        public String toString() {
            if (on) {
                return "Fan speed = " + speed + ", Color = " + color + ", Radius = " + radius;
            } else {
                return "Fan Color  = " + color + ", Radius = " + radius + " FAN IS OFF";
            }
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public fan() {
            super();
            this.speed = SLOW;
            this.on = false;
            this.radius = 5.00;
            this.color = "BLUE";
        }
    }
}

