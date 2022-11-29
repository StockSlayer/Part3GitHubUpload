package com.baseball.part3githubupload;

/***********************************************************************************
 * Title: TestDriver
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: TestDriver.java
 * Description: testing class to test different methods and functions for my program
 ***********************************************************************************/
public class TestDriver {
    public static void main(String[] args){
//        Player[] hitters = {
//                new Hitter("Adley Rutschman"," C", 101, 398),
//                new Hitter("Gunner Henderson","3B", 30, 116),
//                new Hitter("Cedric Mullins ","CF",157, 608),
//                new Hitter("Ryan Mountcastle","1B", 139, 555)};
//
//        SortingUtility.mergeSort(hitters, new HitterAverageComparator());
//        printArray(hitters);
//
//        System.out.println("--------------------------------------------");
//
//        Player[] pitchers = {
//                new Pitcher("Dean Kramer\t","SP", 45, 125.1),
//                new Pitcher("Kyle Bradish\t","SP", 64, 117.2),
//                new Pitcher("Felix Bautista","RP", 16, 65.2)};
//
//        SortingUtility.mergeSort(pitchers, new ERAComparator());
//        printArray(pitchers);
////------------------------------------------------------------------------------
//        //Testing PlayerDoublyLinkedList
//        // Hitters
//        Player adely = new Hitter("Adley Rutschman\t"," C\t", 101, 398);
//        Player gunner = new Hitter("Gunner Henderson\t","3B\t", 30, 116);
//        Player cedric = new Hitter("Cedric Mullins\t","CF\t",157, 608);
//        Player mountie = new Hitter("Ryan Mountcastle\t","1B\t", 139, 555);
//        Player tony = new Hitter("Anthony Santander\t", "RF\t", 138, 574);
//        Player stowers = new Hitter("Kyle Stowers\t", "OF\t", 23, 91);
//        Player vavra = new Hitter("Terrin Vavra\t", "UT\t", 23, 89);
//        Player mckenna = new Hitter("Ryan McKenna\t", "OF\t", 37, 156);
//        Player hays = new Hitter("Austin Hays\t", "LF\t", 134, 535);
//        Player urias = new Hitter("Ramon Urias\t", "3B\t", 100, 403);
//        Player mateo = new Hitter("Jorge Mateo\t", "SS\t", 109, 494);
//        Player odor = new Hitter("Rougned Odor\t", "2B\t", 88, 426);
//        // Starters
//        Player lyles = new Pitcher("Jorden Lyles", "SP", 88, 179.0);
//        Player kremer = new Pitcher("Dean Kremer", "SP", 45, 125.1);
//        Player bradish = new Pitcher("Kyle Bradish", "SP", 64, 117.2);
//        Player watkins = new Pitcher("Spencer Watkins", "SP", 55, 105.1);
//        Player wells = new Pitcher("Tyler Wells", "SP", 49, 103.2);
//        Player voth = new Pitcher("Austin Voth", "SP", 28, 83.0);
//        // Bullpen
//        Player tate = new Pitcher("Dylan Tate", "RP", 25, 73.2);
//        Player baker = new Pitcher("Bryan Baker", "RP", 27, 69.2);
//        Player felix = new Pitcher("Felix Bautista","CL", 16, 65.2);
//        Player perez = new Pitcher("Cionel Perez", "RP", 9, 57.2);
//        Player hall = new Pitcher("DL Hall", "RP", 9, 13.2);
//
////        Player billEnd = new Hitter("Bill End\t\t", "BB", 5, 10);

//        PlayerLinkedList list = new PlayerLinkedList();
//
//        list.addToFront(adely);
//        list.addToFront(gunner);
//        list.addToFront(cedric);
//        list.addToFront(mountie);
//        list.addToFront(tony);
//        list.addToFront(stowers);
//        list.addToFront(vavra);
//        list.addToFront(mckenna);
//        list.addToFront(mateo);
//        list.addToFront(urias);
//        list.addToFront(hays);
//        list.addToFront(odor);
//
//        list.printList();
//        System.out.println(list.getSize());
//
//        LinkedStack pitcherList = new LinkedStack();
//        pitcherList.push(lyles);
//        pitcherList.push(kremer);
//        pitcherList.push(bradish);
//        pitcherList.push(watkins);
//        pitcherList.push(wells);
//        pitcherList.push(voth);
//
//        pitcherList.push(tate);
//        pitcherList.push(baker);
//        pitcherList.push(felix);
//        pitcherList.push(perez);
//        pitcherList.push(hall);
//
//        pitcherList.printStack();

//        Player[] batter = new Player[list.getSize()];
//
//        SortingUtility.mergeSort(batter, new HitterAverageComparator());
////        printArray(batter);
//        for (Player player : batter) {
//            System.out.println(player);
//        }


//        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
//        System.out.println(SearchingUtility.iterativeBinarySearch(intArray, -15));
//        System.out.println(SearchingUtility.iterativeBinarySearch(intArray, 35));
//        System.out.println(SearchingUtility.iterativeBinarySearch(intArray, 8888));
//        System.out.println(SearchingUtility.iterativeBinarySearch(intArray, 1));
//
//        System.out.println(SearchingUtility.recursiveBinarySearch(intArray, -15));
//        System.out.println(SearchingUtility.recursiveBinarySearch(intArray, 35));
//        System.out.println(SearchingUtility.recursiveBinarySearch(intArray, 8888));
//        System.out.println(SearchingUtility.recursiveBinarySearch(intArray, 1));
//
//        System.out.println("-----------------------------------------------------");
//        int[] intArray1 = { 20, 35, -15, 7, 55, 1, -22 };
//        System.out.println(SearchingUtility.linearSearch(intArray1, -15));
//        System.out.println(SearchingUtility.linearSearch(intArray1, 1));
//        System.out.println(SearchingUtility.linearSearch(intArray1, 8888));
//        System.out.println(SearchingUtility.linearSearch(intArray1, -22));
//        System.out.println("-----------------------------------------------------");
//------------------------------------------------------------------------------
       //BinarySearchTest
//       SearchingUtility tree = new SearchingUtility();
//       tree.insert(25);
//       tree.insert(20);
//       tree.insert(15);
//       tree.insert(27);
//       tree.insert(30);
//       tree.insert(29);
//       tree.insert(26);
//       tree.insert(22);
//       tree.insert(32);
//       tree.insert(17);
//       tree.insert(28);
//       tree.insert(16);
//       tree.insert(14);
//       System.out.println("In Order Transversal");
//       tree.traverseInOrder();
//       System.out.println();
//       System.out.println("Pre Order Transversal");
//       tree.traversePreOrder();
//       System.out.println();
//       System.out.println("Post Order Transversal");
//       tree.traversePostOrder();
//       System.out.println();
//----------------------------------------------------------------------
        //Testing HashedTable
        // Hitters
//        Player adely = new Hitter("Adley Rutschman\t"," C\t", 101, 398);
//        Player gunner = new Hitter("Gunner Henderson\t","3B\t", 30, 116);
//        Player cedric = new Hitter("Cedric Mullins\t","CF\t",157, 608);
//        Player mountie = new Hitter("Ryan Mountcastle\t","1B\t", 139, 555);
//        Player tony = new Hitter("Anthony Santander\t", "RF\t", 138, 574);
//        Player stowers = new Hitter("Kyle Stowers\t", "OF\t", 23, 91);
//        Player vavra = new Hitter("Terrin Vavra\t", "UT\t", 23, 89);
//        Player mckenna = new Hitter("Ryan McKenna\t", "OF\t", 37, 156);
//        Player hays = new Hitter("Austin Hays\t", "LF\t", 134, 535);
//        Player urias = new Hitter("Ramon Urias\t", "3B\t", 100, 403);
//        Player mateo = new Hitter("Jorge Mateo\t", "SS\t", 109, 494);
//        Player odor = new Hitter("Rougned Odor\t", "2B\t", 88, 426);
//        // Starters
//        Player lyles = new Pitcher("Jorden Lyles", "SP", 88, 179.0);
//        Player kremer = new Pitcher("Dean Kremer", "SP", 45, 125.1);
//        Player bradish = new Pitcher("Kyle Bradish", "SP", 64, 117.2);
//        Player watkins = new Pitcher("Spencer Watkins", "SP", 55, 105.1);
//        Player wells = new Pitcher("Tyler Wells", "SP", 49, 103.2);
//        Player voth = new Pitcher("Austin Voth", "SP", 28, 83.0);
//        // Bullpen
//        Player tate = new Pitcher("Dylan Tate", "RP", 25, 73.2);
//        Player baker = new Pitcher("Bryan Baker", "RP", 27, 69.2);
//        Player felix = new Pitcher("Felix Bautista","CL", 16, 65.2);
//        Player perez = new Pitcher("Cionel Perez", "RP", 9, 57.2);
//        Player hall = new Pitcher("DL Hall", "RP", 9, 13.2);
//
//        ChainedHashtable ht = new ChainedHashtable();
//        ht.put(" C", adely);
//        ht.put("3B", gunner);
//        ht.put("CF", cedric);
//        ht.put("1B", mountie);
//        ht.put("RF", tony);
//        ht.put("OF", stowers);
//        ht.put("UT", vavra);
//        ht.printHashtable();
//        System.out.println("Retrieve key UT: " + ht.get("UT"));
//        ht.remove("UT");
//        ht.remove("OF");
//        ht.printHashtable();

//        BinaryTree<Player>[] player = {
//                new Hitter(tony)
//        };



//        SortingUtility.mergeSort(pitchers, new ERAComparator());

//        List<Player> pitcherList1 = new ArrayList<>(Arrays.stream(pitchers).toList());

//        Object[] pitchers = pitcherList1.toArray(new Player[pitcherList1.size()]);

//        for (Object pitch: pitchers) {
//            taData1.appendText("\n" + pitch.toString());
//        }

//        taData1.appendText("\nSize Of List: " + pitchers.length);
//        Player adely = new Hitter("Adley Rutschman"," C", 101, 398);
//        Player gunner = new Hitter("Gunner Henderson","3B", 30, 116);
//        Player cedric = new Hitter("Cedric Mullins","CF",157, 608);
//        Player mountie = new Hitter("Ryan Mountcastle","1B", 139, 555);
//        Player tony = new Hitter("Anthony Santander", "RF", 138, 574);
//
//        Player[] hitters = {
//                new Hitter("Adley Rutschman"," C", 101, 398),
//                new Hitter("Gunner Henderson"," 3B", 30, 116),
//                new Hitter("Cedric Mullins"," CF",157, 608),
//                new Hitter("Ryan Mountcastle"," 1B", 139, 555),
//                new Hitter("Anthony Santander", " RF", 138, 574)};


//        new TestDriver();

    } // main


//    public TestDriver(){
//        BST<Player> tree = new BST<>();
//        Player adely = new Hitter("Adley Rutschman\t"," C\t", 101, 398);
//        Player gunner = new Hitter("Gunner Henderson\t","3B\t", 30, 116);
//        Player cedric = new Hitter("Cedric Mullins\t","CF\t",157, 608);
//        Player mountie = new Hitter("Ryan Mountcastle\t","1B\t", 139, 555);
//        Player tony = new Hitter("Anthony Santander\t", "RF\t", 138, 574);
//
//        tree.insert(adely);
//        tree.insert(gunner);
//        tree.insert(cedric);
//        tree.insert(mountie);
//        tree.insert(tony);
////        Scanner key = new Scanner(System.in);
////        System.out.println("Enter the key: ");
//
//        for (int i=0; i<tree.getSize(); i++){
//            if (tree.size > 0){
//                System.out.println(tree.contains(gunner));
//                System.out.println(gunner);
//            }
//        }
//
////                Player[] batters = {
////                new Hitter("Adley Rutschman"," C", 101, 398),
////                new Hitter("Gunner Henderson","3B", 30, 116),
////                new Hitter("Cedric Mullins ","CF",157, 608),
////                new Hitter("Ryan Mountcastle","1B", 139, 555)};
////        BST<Player> playerTree = new BST<>(batters);
////
////        Heap<BST.TreeNode<Player>> treeHeap = new Heap<>();
////        treeHeap.add(new BST.TreeNode<>(adely));
////        treeHeap.add(new BST.TreeNode<>(gunner));
////        treeHeap.add(new BST.TreeNode<>(cedric));
////        treeHeap.add(new BST.TreeNode<>(mountie));
////
//
//
//        BST<String> tree1 = new BST<>();
//        tree1.insert("Rutch= " + adely.getAverage() + "");
//        tree1.insert("Gunner= " + gunner.getAverage() + "");
//        tree1.insert("Cedric= " + cedric.getAverage() + "");
//        tree1.insert("Mountie= " + mountie.getAverage() + "");
//        tree1.insert("Tony= " + tony.getAverage() + "");
//
//        tree1.search(tony.getAverage());
//
//        // Forward traversal
//        for (String s: tree1) {
//            System.out.println(s);
//        }
//        tree1.inorder();
//        System.out.println();
//        tree1.nonRecursiveInorder();
//        System.out.println();
//        tree1.preorder();
//        System.out.println();
//        tree1.postorder();
//        System.out.println();
//
////        for(int i=0; i<personsTree.size(); i++){
////            if(personsTree.getTheObj(i).getName().equals("Krishna")){
////                //found the object with name krishna
////            }
////        }
//    }
//
//    public static<T> void printArray(T []a){
//        for(T t : a){
//            System.out.println(t);
//        }
    //}// GenericPrintArray
} // TestDriver
