public class Weights {
        /**
         * Create weight plate objects
         */ 
        public static final WeightPlate PLATE25 = new WeightPlate(25);
        public static final WeightPlate PLATE20 = new WeightPlate(20);
        public static final WeightPlate PLATE15 = new WeightPlate(15);
        public static final WeightPlate PLATE10 = new WeightPlate(10);
        public static final WeightPlate PLATE5 = new WeightPlate(5);
        public static final WeightPlate PLATE3 = new WeightPlate(3);
        public static final WeightPlate PLATE2HALF = new WeightPlate(2.5);
        public static final WeightPlate PLATE2 = new WeightPlate(2);
        public static final WeightPlate PLATE1HALF = new WeightPlate(1.5);
        public static final WeightPlate PLATE1QUARTER = new WeightPlate(1.25);
        public static final WeightPlate PLATE1 = new WeightPlate(1);
        public static final WeightPlate PLATEHALF = new WeightPlate(0.5);
    
        /* 
        * Put WeightPlate PLATE objects into a an array
        */      
        public static final WeightPlate[] plates = {
            PLATE25, PLATE20, PLATE15, PLATE10, PLATE5, PLATE3,
            PLATE2HALF, PLATE2, PLATE1HALF, PLATE1QUARTER,
            PLATE1, PLATEHALF
        };
    }
    