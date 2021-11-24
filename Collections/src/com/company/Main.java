package com.company;

import java.util.*;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

//        StockItem tempStockItem = new StockItem("bread", 0.75, 100);
//        stockList.addStock(tempStockItem);
//
//        tempStockItem = new StockItem("milk", 3.99, 76);
//        stockList.addStock(tempStockItem);
//
//        tempStockItem = new StockItem("butter", 2.25, 34);
//        stockList.addStock(tempStockItem);
//
//        tempStockItem = new StockItem("meat", 4.50, 42);
//        stockList.addStock(tempStockItem);
//
//        tempStockItem = new StockItem("juice", 3.75, 107);
//        stockList.addStock(tempStockItem);
//
//        tempStockItem = new StockItem("bananas", 0.55, 5);
//        stockList.addStock(tempStockItem);
//
//        tempStockItem = new StockItem("bananas", 0.35, 200);
//        stockList.addStock(tempStockItem);
//
//        tempStockItem = new StockItem("apples", 0.75, 100);
//        stockList.addStock(tempStockItem);
//
//        tempStockItem = new StockItem("chicken", 0.75, 100);
//        stockList.addStock(tempStockItem);
//
//        System.out.println(stockList);
//
//        for(String s: stockList.Items().keySet()) {
//            System.out.println(s);
//        }
//
//
//        Basket myBasket = new Basket("My Basket");
//        sellItem(myBasket, "bread", 5);
//        System.out.println(myBasket);
//
//        sellItem(myBasket, "bread", 10);
//        if(sellItem(myBasket, "bread", 105) != 1) {
//            System.out.println("Out of bread");
//        }
//
//        System.out.println(myBasket);
//
//        sellItem(myBasket, "ice cream", 5);
//        System.out.println(myBasket);
//
//        sellItem(myBasket,"bananas", 7);
//        sellItem(myBasket,"apples", 7);
//        sellItem(myBasket,"juice", 20);
//        System.out.println(myBasket);
//
//        System.out.println(stockList);
//
//
//        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Venus", 225);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Earth", 365);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        temp = new HeavenlyBody("Mars", 687);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenlyBody("Deimos", 1.3);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenlyBody("Phobos", 0.3);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//
//        temp = new HeavenlyBody("Jupiter", 4332);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenlyBody("Io", 1.8);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenlyBody("Europa", 3.5);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenlyBody("Ganymede", 7.1);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenlyBody("Callisto", 16.7);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        temp = new HeavenlyBody("Uranus", 30660);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Neptune", 165);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Pluto", 248);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        System.out.println("Planets");
//        for(HeavenlyBody planet : planets) {
//            System.out.println("\t" + planet.getName());
//        }
//
//        HeavenlyBody body = solarSystem.get("Jupiter");
//        System.out.println("Moons of" + body.getName());
//        for(HeavenlyBody jupiterMoon : body.getSatellites()) {
//            System.out.println("\t" + jupiterMoon.getName());
//        }
//
//        Set<HeavenlyBody> moons = new HashSet<>();
//        for(HeavenlyBody planet : planets) {
//            moons.addAll(planet.getSatellites());
//        }
//
//        System.out.println("All Moons");
//        for(HeavenlyBody moon : moons) {
//            System.out.println("\t" + moon.getName());
//        }
//
//        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
//        planets.add(pluto);
//
//        for(HeavenlyBody planet : planets) {
//            System.out.println(planet.getName());
//        }
//
//        Object o = new Object();
//        o.equals(o);
//        "pluto".equals("");



        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "sitting in front of your computer",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "end of the road at a bridge",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "inside a building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "in a forest",tempExit));

        command("Go North young man");

//        Map<String, String> vocabulary = new HashMap<String, String>();
//        vocabulary.put("QUIT", "Q");
//        vocabulary.put("NORTH", "N");
//        vocabulary.put("SOUTH", "S");
//        vocabulary.put("WEST", "W");
//        vocabulary.put("EAST", "E");


//        int loc = 1;
//        while(true) {
//            System.out.println(locations.get(loc).getDescription());
//            if(loc == 0) {
//                break;
//            }
//
//            Map<String, Integer> exits = locations.get(loc).getExits();
//            System.out.println("Available exits are ");
//            for(String exit: exits.keySet()){
//                System.out.print(exit + ", ");
//            }
//            System.out.println();
//
//            String direction = scanner.nextLine().toUpperCase();
//
//            if(direction.length() > 1) {
//                String[] words = direction.split(" ");
//                for(String word : words) {
//                    if(vocabulary.containsKey(word)) {
//                        direction = vocabulary.get(word);
//                        break;
//                    }
//                }
//            }
//
//
//            if(exits.containsKey(direction)) {
//                loc = exits.get(direction);
//            } else {
//                System.out.println("can't go that direction");
//            }
//        }






//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for (String i : road) {
//            System.out.println(i);
//        }
//        System.out.println("******************");
//
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for (String i : building) {
//            System.out.println(i);
//        }

        System.out.println("******************");
        Theatre theatre = new Theatre("Baghdad", 8, 12);
        // shallow copy
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);

        //seatCopy.get(1).reserve();

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, this seat is taken");
        }

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, this seat is taken");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, this seat is taken");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

//
//        Collections.reverse(seatCopy);
//        System.out.println("printing seatCopy");
//        printList(seatCopy);
//        System.out.println("printing theatre.seats");
//        printList(theatre.seats);
//        Collections.shuffle(seatCopy);
//        System.out.println("printing shuffled seatCopy");
//        printList(seatCopy);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat is " + minSeat.getSeatNumber());
//        System.out.println("Max seat is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);

        // errors .. destination list must be both of sufficient size, but also actually filled with entries to use Collections.copy();
//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList, theatre.seats);
    }

    public static int sellItem(Basket basket, String item, int quantity) {

        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
            System.out.print("$" + seat.getPrice());
        }
        System.out.println();
        System.out.println("===============");
    }

//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size() - 1; j++) {
//                if (list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }





    public static void command(String playerCommand) {

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();

            //String direction = scanner.nextLine().toUpperCase();

//            if(direction.length() > 1) {
//                String[] words = direction.split(" ");
//                for(String word : words) {
//                    if(vocabulary.containsKey(word)) {
//                        direction = vocabulary.get(word);
//                        break;
//                    }
//                }
//            }
//
//
//            if(exits.containsKey(direction)) {
//                loc = exits.get(direction);
//            } else {
//                System.out.println("can't go that direction");
//            }
        }
    }


}