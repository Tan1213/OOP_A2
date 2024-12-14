public class AssignmentTwo {

    public static void main(String[] args) {

        partThree();

        partFourA();

        partFourB();

        partFive();

        partSix();

        partSeven();

    }

    public static void partThree() {
        Employee James = new Employee("James","Street One",27,"3215465","Safety officer");
        Ride ride= new Ride("roller coaster",James,6,8);
        Visitor John = new Visitor("John","Street One",15,"16544","VIP");
        Visitor Michael = new Visitor("Michael","Street One",18,"15894","NVIP");
        Visitor Joseph = new Visitor("Joseph","Street One",17,"16515","SVIP");
        Visitor Charles = new Visitor("Charles","Street One",26,"29495","VIP");
        Visitor Elizabeth = new Visitor("Elizabeth","Street One",49,"16547","VIP");

        ride.addVisitorToQueue(John);
        ride.addVisitorToQueue(Michael);
        ride.addVisitorToQueue(Joseph);
        ride.addVisitorToQueue(Charles);
        ride.addVisitorToQueue(Elizabeth);
        ride.removeVisitorFromQueue();
        ride.printQueue();

    }


    public static void partFourA() {

        Employee James = new Employee("James","Street One",27,"3215465","Safety officer");
        Ride ride= new Ride("merry-go-round",James,6,8);
        Visitor John = new Visitor("John","Street One",15,"16544","VIP");
        Visitor Michael = new Visitor("Michael","Street One",18,"15894","NVIP");
        Visitor Joseph = new Visitor("Joseph","Street One",17,"16515","SVIP");
        Visitor Charles = new Visitor("Charles","Street One",26,"29495","VIP");
        Visitor Elizabeth = new Visitor("Elizabeth","Street One",49,"16547","VIP");

        ride.addVisitorToHistory(John);
        ride.addVisitorToHistory(Michael);
        ride.addVisitorToHistory(Joseph);
        ride.addVisitorToHistory(Charles);
        ride.addVisitorToHistory(Elizabeth);

        boolean exists = ride.checkVisitorFromHistory(Michael);

        System.out.println(" Is John in the history records? " + exists);

        int numVisitors = ride.numberOfVisitors();

        System.out.println("Number of visitors in the history records: " + numVisitors);


        ride.printRideHistory();

    }


    public static void partFourB() {

        Employee James = new Employee("James","Street One",27,"3215465","Safety officer");
        Ride ride= new Ride("ferris wheel",James,6,8);
        Visitor John = new Visitor("John","Street One",15,"16544","VIP");
        Visitor Michael = new Visitor("Michael","Street One",18,"15894","NVIP");
        Visitor Joseph = new Visitor("Joseph","Street One",17,"16515","SVIP");
        Visitor Charles = new Visitor("Charles","Street One",26,"29495","VIP");
        Visitor Elizabeth = new Visitor("Elizabeth","Street One",49,"16547","VIP");

        ride.addVisitorToHistory(John);
        ride.addVisitorToHistory(Michael);
        ride.addVisitorToHistory(Joseph);
        ride.addVisitorToHistory(Charles);
        ride.addVisitorToHistory(Elizabeth);


        System.out.println("Before sorting:");

        ride.printRideHistory();


        ride.sortRideHistory();


        System.out.println("After sorting:");

        ride.printRideHistory();

    }


    public static void partFive() {

        Employee James = new Employee("James","Street One",27,"3215465","Safety officer");
        Ride ride= new Ride("Pirate Ship",James,6,8);
        Visitor John = new Visitor("John","Street One",15,"16544","VIP");
        Visitor Michael = new Visitor("Michael","Street One",18,"15894","NVIP");
        Visitor Joseph = new Visitor("Joseph","Street One",17,"16515","SVIP");
        Visitor Charles = new Visitor("Charles","Street One",26,"29495","VIP");
        Visitor Elizabeth = new Visitor("Elizabeth","Street One",49,"16547","VIP");
        Visitor Mary = new Visitor("Mary","Street One",25,"26544","VIP");
        Visitor Patricia = new Visitor("Patricia","Street One",48,"16594","NVIP");
        Visitor Lisa = new Visitor("Lisa","Street One",27,"34654","SVIP");
        Visitor Nancy = new Visitor("Nancy","Street One",36,"45616","VIP");
        Visitor Dorothy = new Visitor("Dorothy","Street One",42,"17914","SVIP");


        ride.addVisitorToQueue(John);
        ride.addVisitorToQueue(Michael);
        ride.addVisitorToQueue(Joseph);
        ride.addVisitorToQueue(Charles);
        ride.addVisitorToQueue(Elizabeth);
        ride.addVisitorToQueue(Mary);
        ride.addVisitorToQueue(Patricia);
        ride.addVisitorToQueue(Lisa);
        ride.addVisitorToQueue(Nancy);
        ride.addVisitorToQueue(Dorothy);



        System.out.println("before run:");

        ride.printQueue();




        ride.runOneCycle();




        System.out.println("after run:");

        ride.printQueue();



        ride.printRideHistory();

    }


    public static void partSix() {


        Employee James = new Employee("James","Street One",27,"3215465","Safety officer");
        Ride ride= new Ride("River Rapids Ride",James,6,8);
        Visitor John = new Visitor("John","Street One",15,"16544","VIP");
        Visitor Michael = new Visitor("Michael","Street One",18,"15894","NVIP");
        Visitor Joseph = new Visitor("Joseph","Street One",17,"16515","SVIP");
        Visitor Charles = new Visitor("Charles","Street One",26,"29495","VIP");
        Visitor Elizabeth = new Visitor("Elizabeth","Street One",49,"16547","VIP");

        ride.addVisitorToHistory(John);
        ride.addVisitorToHistory(Michael);
        ride.addVisitorToHistory(Joseph);
        ride.addVisitorToHistory(Charles);
        ride.addVisitorToHistory(Elizabeth);


        ride.exportRideHistory("export.csv");

    }


    public static void partSeven() {


        Ride ride = new Ride("teacup ride");


        ride.importRideHistory("export.csv");


        int numVisitors = ride.numberOfVisitors();

        System.out.println("Number of visitors in the history records: " + numVisitors);

        ride.printRideHistory();

    }

}


