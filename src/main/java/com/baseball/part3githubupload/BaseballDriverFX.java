package com.baseball.part3githubupload;
//* *****************************************************************************************
// * Title: BaseballDriverFX
// * Author: Sean Laverty
// * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
// * File: BaseballDriverFX.java
// * Description: Runs the application through the start method, setting the scene and stage.
//  STEPS OF USE:
// *  1, Click the dropdown menu, There are 9 options.
// *
// 2, If you select hitter another dropdown will pop up and the only one that works is the
//       sort players by average. Select that and pop up will happen asking if you want your
//       list sorted by AVG Click yes. Then a sorted list of player from the unsorted list of
//       hitters stored in the hitter array will pop up and the size hof the number of players
//       will be at the bottom.
// *
// 3,    Exit until you return to the opening baseball++ scene click the comboBox dropdown and select the
//       third option save hitter. A pop-up will ask you if you want to save the hitters, click yes.
//
//    4, Next click the dropdown again and click the 5th option which says ViewSavedHitters and a scene
//       of the saved hitters will be brought up and the size at the bottom. Exit back to the main screen.
//
//    5, Click pitcher and select the first option sort pitchers by their era. a sorted list of pitchers
//       will pop up with a list of the size at the bottom.
//
//    6, Exit until you return to the opening baseball++ scene click the comboBox dropdown and select the
//       Fourth option SavePitcher. A pop-up will ask you if you want to save the pitchers, you click yes.
//
//    7, Next click the dropdown again and click the 7th option which says ViewSavedHPitchers and a scene
//     of the saved pitchers will be brought up and the size at the bottom. Exit back to the main screen.
//
//    8, next click pitcher again and this time click arrayStack option. a  pop-up will ask you if you want
//      to test ArrayStack and you click yes. A Scene will appear, it will be a list of pitchers that where
//      pushed into an array from the arrayStack class I created and then popped each one onto a textArea.
//
//    9, Exit that and click the next option down and that is TestLinkedStack, meant to test the linkedStack
//       class. click yes to the pop-up asking if you want to test the linked stack class. A stack of the pitchers
//       ERA will pop up and show that the linkedStack is working and can be used for hitters as well.
//
//    10, There is an option for add player if you would like you can click it. Unfortunately, it is not
//       totally working yet. But it will bring you to a scene where you can type a players name and position
//       click a radio button either pitcher or hitter and depending on which one you choose different
//       textFields will appear for you to input the players hits and at bats for a hitter and click
//       the add button, and they would appear in the textile with their era or batting average calculated.
//       again not working totally but if you want to check it out you can.
//
//    11, The 8th option called HitterListView will bring up a listView of the hitters sorted by there AVG
//        and mapped out by there position and if you click on their positions you will see that each position
//        corresponds to that player, and it can hold different more than one player. if there position is
//        the same, and they will still be sored by their AVG. In fact if you notice the position buttons
//        are sorted by the player with the highest batting average.
//
//    12, The 9th option called PitcherListView does the same as its opposite but just for the pitchers position
//        instead of the hitters.
//
//    13, Note: if you want to test PlayerLinkedList option in the pitcher selection menu then you will see
//              it works, but it only prints and does not appear in a text area.


// Improvements for part 3:
// Created a ChainedHashtable Class that is meant to represent a hashTable and allow a user to too up
// a Player based on there position, and it is in linear time. The reason I used a linked list too
// store the players and
//
// For the Binary Tree Search in the hitter menu it shows an example of using a binary treee to
// show a forward and backward traversal of inserted elements by converting them to strings
// * ****************************************************************************************
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;
import java.util.function.Predicate;

public class BaseballDriverFX extends Application {
    private static TextArea ta1 = new TextArea();
    private static TextArea ta = new TextArea();


    private static TextArea taData5;

    //Single dimensional array that represents the Opening Menu
    private static String[] menuOne = {"Hitter", "Pitcher", "SaveHitter", "SavePitcher",
            "ViewSavedHitters", "ViewSavedPitchers", "AddPlayer", "HitterListViewDesign",
            "PitcherListViewDesign"};

    // Hitter sorted stats menu
    private static String[] hitterSortedStatsMenu = {"SortHittersByAVG", "HashTable", "BinaryTree", "OPS"};

    // Pitcher sorted Stats menu
    private static String[] pitcherSortedStatsMenu = {"SortPitchersByERA", "ArrayStack", "PlayerLinkedList", "TestLinkedStack"};

    // Single dimensional array that represents hitters for testing
    private static Player[] hitters = {
            new Hitter("Adley Rutschman  ", "  C", 101, 398),
            new Hitter("Gunner Henderson ", " 3B", 30, 116),
            new Hitter("Cedric Mullins   \t", " CF", 157, 608),
            new Hitter("Ryan Mountcastle ", " 1B", 139, 555),
            new Hitter("Anthony Santander", "RF", 138, 574),
            new Hitter("Kyle Stowers     \t", "OF", 23, 91),
            new Hitter("Terrin Vavra     \t", "UT", 23, 89),
            new Hitter("Ryan McKenna     ", "OF", 37, 156),
            new Hitter("Austin Hays      \t", "LF", 134, 535),
            new Hitter("Ramon Urias      \t", "3B", 100, 403),
            new Hitter("Jorge Mateo      \t", "SS", 109, 494),
            new Hitter("Rougned Odor     ", "2B", 88, 426)};

    // Single dimensional array that represents pitchers for testing
    private static Player[] pitchers = {
            new Pitcher("Jorden Lyles    ", "SP", 88, 179.0),
            new Pitcher("Dean Kremer     ", "SP", 45, 125.1),
            new Pitcher("Kyle Bradish    ", "SP", 64, 117.2),
            new Pitcher("Spencer Watkins ", "SP", 55, 105.1),
            new Pitcher("Tyler Wells     ", "SP", 49, 103.2),
            new Pitcher("Austin Voth     ", "SP", 28, 83.0),
            new Pitcher("Dylan Tate      ", "RP", 25, 73.2),
            new Pitcher("Bryan Baker     ", "RP", 27, 69.2),
            new Pitcher("Felix Bautista   ", "CL", 16, 65.2),
            new Pitcher("Cionel Perez    ", "RP", 9, 57.2),
            new Pitcher("DL Hall         ", "RP", 9, 13.2)};

    //Text area for displaying text
    private static TextArea taData = new TextArea();
    private static TextArea taData1 = new TextArea();
    private static TextArea taData2 = new TextArea();
    private static TextArea taData3 = new TextArea();
    // new
    private static TextArea taData4 = new TextArea();
    // ComboBox's for choice selection
    private static ComboBox<String> comboBox1;
    private static ComboBox<String> comboBox2;
    private static ComboBox<String> comboBox3;

    // Vbox for displaying
    private static VBox vBox1;
    private static VBox vBox2;
    private static VBox vBox3;

    // HBox for displaying
    private static HBox hBox1;
    private static HBox hBox2;
    private static HBox hBox3;

    // BorderPane for displaying
    private static BorderPane borderPane1;
    private static BorderPane borderPane2;
    private static BorderPane borderPane3;
    private static BorderPane borderPane4;

    // Buttons
    private static Button btSelect1;
    private static Button btSelect2;
    private static Button btSelect3;

    // Player
    private static Player disPlayer;
    private static Player currentPlayer;
    //private static Player stackedPlayer;

    // TextField (Player)
    private static TextField tfName;
    private static TextField tfPos;
    // TextFields (Hitter)
    private static TextField tfHits;
    private static TextField tfAB;
    // TextFields (Pitcher)
    private static TextField tfER;
    private static TextField tfIP;

    // GridPane for adding player
    private static GridPane gridPane1;

    // new
    private static GridPane gp2;
    //----------------------------------------------------------------------
    @Override
    public void start(Stage stage) throws IOException {
        // Creating first combobox for selection
        comboBox1 = new ComboBox<>();
        comboBox1.setEditable(false);

        // Creating an ObservableList and adding menu one to the list
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(menuOne);

        // comboBox settings
        comboBox1.setPromptText("Options");
        comboBox1.setItems(list);

        // Create a Button for selecting items in the comboBox
        btSelect1 = new Button("Select");
        // Putting button in HBox
        hBox1 = new HBox();
        hBox1.getChildren().add(btSelect1);
        hBox1.setAlignment(Pos.CENTER);

        // VBox for the ComboBox
        vBox1 = new VBox();
        vBox1.getChildren().add(comboBox1);
        vBox1.setAlignment(Pos.CENTER);

        //BorderPane
        borderPane1 = new BorderPane();
        borderPane1.setPadding(new Insets(0, 0, 40, 0));
        borderPane1.setCenter(vBox1);
        borderPane1.setBottom(hBox1);

        // setActionButton for select
        btSelect1.setOnAction(e -> {
            String value = comboBox1.getSelectionModel().getSelectedItem();
            if (Objects.equals(value, "Hitter")) {
                hitters(); // hitterMethod
            } else if (Objects.equals(value, "Pitcher")) {
                pitchers(); // pitcher method
            } else if (Objects.equals(value, "SaveHitter")) {
                saveHitters(); // have hitter method
            } else if (Objects.equals(value, "SavePitcher")) {
                savePitchers(); // save pitcher method
            } else if (Objects.equals(value, "ViewSavedHitters")) {

                FxUtility.getYesNo("SavedHitters",
                        "Do you want to load the saved Hitters?");
                try (ObjectInputStream inputStream = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream("o.dat")))) {
                    taData = new TextArea(value);
                    display(hitters);
                    taData.appendText("Size Of List: " + hitters.length);
                    Scene scene = new Scene(taData);
                    Stage stage1 = new Stage();
                    stage1.setScene(scene);
                    stage1.setWidth(400);
                    stage1.setHeight(480);
                    stage1.show();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            } else if (Objects.equals(value, "ViewSavedPitchers")) {

                FxUtility.getYesNo("SavedPitchers",
                        "Do you want to load the saved Pitchers?");
                try (ObjectInputStream inputStream = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream("o.dat")))) {
                    taData = new TextArea(value);
                    display(pitchers);
                    taData.appendText("Size Of List: " + pitchers.length);
                    Scene scene = new Scene(taData);
                    Stage stage1 = new Stage();
                    stage1.setScene(scene);
                    stage1.setWidth(400);
                    stage1.setHeight(480);
                    stage1.show();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            } else if (Objects.equals(value, "AddPlayer")) {
//                addPlayer();
            } else if (Objects.equals(value, "HitterListViewDesign")) {
                //
                listViewHittersMap();
            } else if (Objects.equals(value, "PitcherListViewDesign")) {
                listViewPitchersMap();
            }
        });

        Scene scene = new Scene(borderPane1, 250, 180);
        stage.setTitle("Baseball++");
        stage.setScene(scene);
        stage.show();
    } // start(Stage stage)

    //----------------------------------------------------------------------
    //main method
    public static void main(String[] args) {
        launch();
    } //main(String[] args)

    //---------------------------------------------------------------------------
    // Method for when Hitter is selected
    public void hitters() {
        // Creating second combobox for selection
        comboBox2 = new ComboBox<>();
        comboBox2.setEditable(false);
        // Creating an ObservableList and adding menu one to the list
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(hitterSortedStatsMenu);

        // comboBox settings
        comboBox2.setPromptText("HittersOptions");
        comboBox2.setItems(list);

        // Create a Button for selecting items in the comboBox
        btSelect2 = new Button("Select");

        // Putting button in HBox
        hBox2 = new HBox();
        hBox2.getChildren().add(btSelect2);
        hBox2.setAlignment(Pos.CENTER);

        // VBox for the ComboBox
        vBox2 = new VBox();
        vBox2.getChildren().add(comboBox2);
        vBox2.setAlignment(Pos.CENTER);

        // setActionButton for select
        btSelect2.setOnAction(e -> {

            String value1 = comboBox2.getSelectionModel().getSelectedItem();

            // O(n)
            if (Objects.equals(value1, "SortHittersByAVG")) {
                FxUtility.getYesNo("Sorting BY: ", "Do you want your players to be " +
                        "\nsorted by their AVG");
                // Set the value of the textArea
                taData.setText(value1);
                // Call SortingUtility to sort the hitters by the batting average
                SortingUtility.mergeSort(hitters, new HitterAverageComparator());
                // use the list interface to create an arraylist to add the hitters array of players
                List<Player> hitterList1 = new ArrayList<>(Arrays.stream(hitters).toList());
                // Switch back from an array list to an object array to open the sorted hitters to
                // the text area and initialize the size to the current arrayList
                Object[] hitter = hitterList1.toArray(new Player[hitterList1.size()]);
                // use a for each loop to append the array of sorted players to the text area
                display(hitter);
//                for (Object bat: hitter) {
//                    taData.appendText("\n" + bat.toString());
//                }
                // append the size of the list of players to the tex area so you have an idea of how many
                // players are in the list.
                taData.appendText("Size Of List: " + hitter.length);
                // Create a scene to append the text area too.
                //set the scene
                Scene scene = new Scene(taData);
                Stage stage1 = new Stage();
                stage1.setScene(scene);
                stage1.setWidth(400);
                stage1.setHeight(500);
                stage1.show();

            } else if (Objects.equals(value1, "HashTable")) {

                Player adely = new Hitter("Adley Rutschman\t", " C\t", 101, 398);
                Player gunner = new Hitter("Gunner Henderson\t", "3B\t", 30, 116);
                Player cedric = new Hitter("Cedric Mullins\t", "CF\t", 157, 608);
                Player mountie = new Hitter("Ryan Mountcastle\t", "1B\t", 139, 555);
                Player tony = new Hitter("Anthony Santander\t", "RF\t", 138, 574);
                Player stowers = new Hitter("Kyle Stowers\t", "OF\t", 23, 91);
                Player vavra = new Hitter("Terrin Vavra\t", "UT\t", 23, 89);
                Player hays = new Hitter("Austin Hays\t", "LF\t", 134, 535);
                Player urias = new Hitter("Ramon Urias\t", "2B\t", 100, 403);
                Player mateo = new Hitter("Jorge Mateo\t", "SS\t", 109, 494);

                ChainedHashtable ht = new ChainedHashtable();
                ht.put("C", adely);
                ht.put("3B", gunner);
                ht.put("CF", cedric);
                ht.put("1B", mountie);
                ht.put("RF", tony);
                ht.put("OF", stowers);
                ht.put("UT", vavra);
                ht.put("LF", hays);
                ht.put("SS", mateo);
                ht.put("2B", urias);

                TextField tfRetrieve = new TextField();
                Button btRetrieve = new Button("Retrieve");
                Button btHelp = new Button("Rules/Help");
                gp2 = new GridPane();
                gp2.setVgap(5);
                gp2.setHgap(5);
                gp2.setPadding(new Insets(10, 5, 5, 5));
                gp2.add(new Label("Key:"), 0, 0);
                gp2.add(tfRetrieve, 1, 0);

                HBox hbx = new HBox();
                hbx.getChildren().addAll(btRetrieve, btHelp);
                hbx.setAlignment(Pos.CENTER);

                Label exLabel = new Label("Keys:\n C,1B, 2B, 3B, SS, LF, RF, CF, OF, UT, DH");
                BorderPane bp = new BorderPane();
                bp.setPadding(new Insets(5, 5, 5, 5));
                bp.setTop(gp2);
                bp.setCenter(hbx);
                bp.setBottom(exLabel);

                btRetrieve.setOnAction(s -> {
                    taData4.setText(value1 + "\n");
                    taData4.appendText(String.valueOf(ht.get(tfRetrieve.getText())));
                    Scene scene2 = new Scene(taData4);
                    Stage stage2 = new Stage();
                    stage2.setScene(scene2);
                    stage2.setWidth(400);
                    stage2.setHeight(200);
                    stage2.show();
                });
                btHelp.setOnAction(x -> {
                    FxUtility.showFXMessage("Instructions", "There are 12 types of hitters for a Lineup\n" +
                                    "\n Use these as keys to retrieve the hitters",
                            " C,1B, 2B, 3B, SS, LF, RF, CF, OF, UT, DH");
                });
                Scene scene2 = new Scene(bp);
                Stage stage2 = new Stage();
                stage2.setScene(scene2);
                stage2.setWidth(240);
                stage2.setHeight(195);
                stage2.show();


            } else if (Objects.equals(value1, "BinaryTree")) {
                addPlayer();

            } else if (Objects.equals(value1, "OPS")) {


            }
        });
        //BorderPane
        borderPane2 = new BorderPane();
        borderPane2.setPadding(new Insets(0, 0, 40, 0));
        borderPane2.setCenter(vBox2);
        borderPane2.setBottom(hBox2);
        // Scene setup for hitter
        Scene scene = new Scene(borderPane2);
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        stage1.setWidth(250);
        stage1.setHeight(180);
        stage1.show();
    } // hitter (method)

    //----------------------------------------------------------------------
    // Method for Pitcher
    public void pitchers() {
        // Creating third combobox for selection
        comboBox3 = new ComboBox<>();
        comboBox3.setEditable(false);
        // Creating an ObservableList and adding menu one to the list
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(pitcherSortedStatsMenu);
        // comboBox settings
        comboBox3.setPromptText("PitcherOptions");
        comboBox3.setItems(list);
        // Create a Button for selecting items in the comboBox
        btSelect3 = new Button("Select");
        // Putting button in HBox
        hBox3 = new HBox();
        hBox3.getChildren().add(btSelect3);
        hBox3.setAlignment(Pos.CENTER);
        // VBox for the ComboBox
        vBox3 = new VBox();
        vBox3.getChildren().add(comboBox3);
        vBox3.setAlignment(Pos.CENTER);
        //"K/BB", "K/9", "WHIP", "ERA"
        // setActionButton for select
        btSelect3.setOnAction(e -> {
            // Value 2 represents comboBox3
            String value2 = comboBox3.getSelectionModel().getSelectedItem();

            if (Objects.equals(value2, "SortPitchersByERA")) {
                FxUtility.getYesNo("Sorting BY: ", "Do you want the pitchers" +
                        "\nsorted by their ERA");
                taData1.setText(value2);
                // Call SortingUtility to sort the hitters by the batting average
                SortingUtility.mergeSort(pitchers, new ERAComparator());
                // use the list interface to create an arraylist to add the hitters array of players
                List<Player> pitcherList1 = new ArrayList<>(Arrays.stream(pitchers).toList());
                // Switch back from an array list to an object array to open the sorted hitters to
                // the text area and initialize the size to the current arrayList
                Object[] pitchers = pitcherList1.toArray(new Player[pitcherList1.size()]);
                // use a for each loop to append the array of sorted players to the text area
                for (Object pitch : pitchers) {
                    taData1.appendText("\n" + pitch.toString());
                }
                // append the size of the list of players to the tex area so you have an idea of how many
                // players are in the list.
                taData1.appendText("\nSize Of List: " + pitchers.length);
                // Create a scene to append the text area too.
                Scene scene2 = new Scene(taData1);
                Stage stage2 = new Stage();
                stage2.setScene(scene2);
                stage2.setWidth(400);
                stage2.setHeight(500);
                stage2.show();
//------------------------------------------------------------------------------
                // Selection for testing the arrayStackClass
            } else if (Objects.equals(value2, "ArrayStack")) {
                FxUtility.getYesNo("testing: ", "Do you want to test ArrayStack?");
                // Set the value of the textArea
                taData.setText(value2);
                // set the capacity to 10
                ArrayStack stack = new ArrayStack(10);
                stack.push(new Pitcher("Dean Kremer   ",
                        "SP", 45, 125.1));
                stack.push(new Pitcher("Kyle Bradish  ",
                        "SP", 64, 117.2));
                stack.push(new Pitcher("Tyler Wells   ",
                        "SP", 49, 103.2));
                stack.push(new Pitcher("Dylan Tate    ",
                        "RP", 25, 73.2));
                stack.push(new Pitcher("Felix Bautista",
                        "CL", 16, 65.2));
                stack.push(new Pitcher("Cionel Perez ",
                        "RP", 9, 57.2));
                stack.push(new Pitcher("DL Hall         ",
                        "RP", 9, 13.2));
                //append the array stack data to the textArea by popping it out of the stack one by one
                taData2.appendText("\n" + stack.pop() + "");
                taData2.appendText(stack.pop() + "");
                taData2.appendText(stack.pop() + "");
                taData2.appendText(stack.pop() + "");
                taData2.appendText(stack.pop() + "");
                taData2.appendText(stack.pop() + "");
                taData2.appendText(stack.pop() + "");
                //set the scene and stage
                Scene scene2 = new Scene(taData2);
                Stage stage2 = new Stage();
                stage2.setScene(scene2);
                stage2.setWidth(400);
                stage2.setHeight(500);
                stage2.show();
//------------------------------------------------------------------------------
                // Selection for testing the PlayerLinkedList Class
            } else if (Objects.equals(value2, "PlayerLinkedList")) {
                FxUtility.getYesNo("Testing: ", "Do you want to test PlayerLinkedList");
                taData.setText(value2);
                PlayerLinkedList playerLinkedList = new PlayerLinkedList();
                Player kremer =
                        new Pitcher("Dean Kremer", "SP", 45, 125.1);
                Player bradish =
                        new Pitcher("Kyle Bradish", "SP", 64, 117.2);
                Player wells =
                        new Pitcher("Tyler Wells", "SP", 49, 103.2);
                Player tate =
                        new Pitcher("Dylan Tate", "RP", 25, 73.2);
                Player felix =
                        new Pitcher("Felix Bautista", "CL", 16, 65.2);
                Player perez =
                        new Pitcher("Cionel Perez", "RP", 9, 57.2);
                Player hall =
                        new Pitcher("DL Hall", "RP", 9, 13.2);
                playerLinkedList.addToFront(kremer);
                playerLinkedList.addToFront(wells);
                playerLinkedList.addToFront(tate);
                playerLinkedList.addToFront(felix);
                playerLinkedList.addToFront(perez);
                playerLinkedList.addToFront(hall);
                playerLinkedList.addToEnd(hall);
                playerLinkedList.printList();





                //FxUtility.showFXInput();
                // note still working on this
                // NO Idea how to get ths onto a texa area
//------------------------------------------------------------------------------
                // Selection for testing the LinkedStack Class
            } else if (Objects.equals(value2, "TestLinkedStack")) {
                FxUtility.getYesNo("Sorting BY: ", "Test LinkedStack?");
                taData.setText(value2);
                // creates a linkedStack
                LinkedStack ls = new LinkedStack();
                // Starters
                Player lyles =
                        new Pitcher("Jorden Lyles      ", "SP", 88, 179.0);
                Player kremer =
                        new Pitcher("Dean Kremer       ", "SP", 45, 125.1);
                Player bradish =
                        new Pitcher("Kyle Bradish      ", "SP", 64, 117.2);
                Player watkins =
                        new Pitcher("Spencer Watkins   ", "SP", 55, 105.1);
                Player wells =
                        new Pitcher("Tyler Wells       ", "SP", 49, 103.2);
                Player voth =
                        new Pitcher("Austin Voth       ", "SP", 28, 83.0);
                // Bullpen
                Player tate =
                        new Pitcher("Dylan Tate        ", "RP", 25, 73.2);
                Player baker =
                        new Pitcher("Bryan Baker       ", "RP", 27, 69.2);
                Player felix =
                        new Pitcher("Felix Bautista     ", "CL", 16, 65.2);
                Player perez =
                        new Pitcher("Cionel Perez      ", "RP", 9, 57.2);
                Player hall =
                        new Pitcher("DL Hall            ", "RP", 9, 13.2);
                ls.push(lyles);
                ls.push(kremer);
                ls.push(bradish);
                ls.push(watkins);
                ls.push(wells);
                ls.push(voth);
                ls.push(tate);
                ls.push(baker);
                ls.push(felix);
                ls.push(perez);
                ls.push(hall);
                // pop and append the data from the linkStack and
                // specify it to just getting the pitchers ERA
                taData3.appendText("\n" + ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n");
                taData3.appendText(ls.pop().getERA() + "\n\n");
//                taData3.appendText("\n" + ls.pop());
//                taData3.appendText(ls.pop() + "");
//                taData3.appendText(ls.pop() + "");
//                taData3.appendText(ls.pop() + "\n");
//                taData3.appendText(ls.pop() + "\n");
//                taData3.appendText(ls.pop() + "\n");
//                taData3.appendText(ls.pop() + "\n");
//                taData3.appendText(ls.pop() + "\n");
//                taData3.appendText(ls.pop() + "\n");
//                taData3.appendText(ls.pop() + "\n");
//                taData3.appendText(ls.pop() + "\n\n");
//                taData.appendText(null);
                // Set the scene and stage
                Scene scene2 = new Scene(taData3);
                Stage stage2 = new Stage();
                stage2.setScene(scene2);
                stage2.setWidth(400);
                stage2.setHeight(300);
                stage2.show();
            }
        });
        //BorderPane
        borderPane3 = new BorderPane();
        borderPane3.setPadding(new Insets(0, 0, 40, 0));
        borderPane3.setCenter(vBox3);
        borderPane3.setBottom(hBox3);
        // Scene setup for pitcher
        Scene scene = new Scene(borderPane3);
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        stage1.setWidth(250);
        stage1.setHeight(180);
        stage1.show();
    }

    //----------------------------------------------------------------------
    // Save the hitter Array
    public void saveHitters() {
        FxUtility.getYesNo("SaveHitters", "Do you want to save the Hitters?");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("o.dat", true)))) {
            outputStream.write(hitters.length);
        } catch (FileNotFoundException x) {
            x.printStackTrace();
        } catch (IOException xx) {
            System.out.println(" IO Error ");
        }
    }

    //----------------------------------------------------------------------
    // save the pitcher array
    public void savePitchers() {
        FxUtility.getYesNo("SavePitchers", "Do you want to save the Pitchers?");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("o.dat", true)))) {
            outputStream.write(pitchers.length);
        } catch (FileNotFoundException x) {
            x.printStackTrace();
        } catch (IOException xx) {
            System.out.println(" IO Error ");
        }
    }

    //----------------------------------------------------------------------
    // Still Working on this doesn't work properly
    public void addPlayer() {

        Player adely = new Hitter("Adley Rutschman\t", " C\t", 101, 398);
        Player gunner = new Hitter("Gunner Henderson\t", "3B\t", 30, 116);
        Player cedric = new Hitter("Cedric Mullins\t\t", "CF\t", 157, 608);
        Player mountie = new Hitter("Ryan Mountcastle\t", "1B\t", 139, 555);
        Player tony = new Hitter("Anthony Santander\t", "RF\t", 138, 574);

        BST<String> tree1 = new BST<>();

        tree1.insert(adely + "");
        tree1.insert(gunner + "");
        tree1.insert(cedric + "");
        tree1.insert(mountie + "");
        tree1.insert(tony + "");

        for (String s : tree1) {
            ta.appendText(s);
        }

        // Backward traversal
        ListIterator<String> iterator = tree1.iterator(tree1.getSize());
        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
            ta1.appendText(iterator.previous());
        }

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setTop(ta);
        pane.setCenter(new Label("Forwarded Iteration Above.\n Backward Iteration Bellow"));
        pane.setBottom(ta1);

        Scene scene = new Scene(pane);
        Stage stage1 = new Stage();
        stage1.setTitle("BSTAnimation");
        stage1.setScene(scene);
        stage1.setWidth(450);
        stage1.setHeight(500);
        stage1.show();

//        BorderPane pane = new BorderPane();
//
//        TextField tfAdd = new TextField();
//        Label lbAdd = new Label("Add a Player to the Tree: ");
//        Button btAdd = new Button("Add");
//
//        TextField tfSearch = new TextField();
//        Label lbSearch = new Label("Search for player in tree: ");
//        Button btSearch = new Button("Search");
//
//        TextField tfRetrieve = new TextField();
//        Label lbRetrieve = new Label("Retrieve Player: ");
//        Button btRetrieve = new Button("Retrieve");

//        HBox hbox = new HBox();
//        hbox.getChildren().addAll();
//        hbox.setAlignment(Pos.BASELINE_CENTER);


//        // Creating a player
//        disPlayer = new Player() {
//            @Override
//            public String getAverage() {
//                return null;
//            }
//            @Override
//            public String getERA() {
//                return null;
//            }
//        };
//        tfName = new TextField(disPlayer.getName());
//        tfPos = new TextField(disPlayer.getPosition());
//        // creates radio buttons
//        RadioButton rbHitter = new RadioButton(" Hitter ");
//        RadioButton rbPitcher = new RadioButton(" Pitcher ");
//        // creates a gridpane for the radio buttons
//        GridPane paneRB = new GridPane();
//        paneRB.add(rbHitter, 0, 0);
//        paneRB.add(rbPitcher, 1, 0);
//        ToggleGroup tg = new ToggleGroup();
//        rbHitter.setToggleGroup(tg);
//        rbPitcher.setToggleGroup(tg);
//        if (disPlayer instanceof Hitter) {
//            tfHits = new TextField(((Hitter) disPlayer).getHits() + "");
//            tfAB = new TextField(((Hitter) disPlayer).getAtBats() + "");
//            rbHitter.setDisable(false);
//            rbHitter.setSelected(true);
//            rbPitcher.setDisable(true);
//        } else if (disPlayer instanceof Pitcher) {
//            tfER = new TextField(((Pitcher) disPlayer).getEarnedRuns() + "");
//            tfIP = new TextField(((Pitcher) disPlayer).getInningsPitched() + "");
//            rbPitcher.setDisable(false);
//            rbPitcher.setSelected(true);
//            rbHitter.setDisable(true);
//        }
//        tfName.setEditable(true);
//        tfPos.setEditable(true);
//        // Setting display GridPane
//        gridPane1 = new GridPane();
//        gridPane1.setHgap(5);
//        gridPane1.setVgap(5);
//        // Display the labels and text fields on the display gridpane
//        gridPane1.add(new Label("Name:"), 0, 0); // column=0 row=0
//        gridPane1.add(tfName, 1, 0);               // column=1 row=0
//        gridPane1.add(new Label("Position:"), 2, 0); // column=1 row=0
//        gridPane1.add(tfPos, 3, 0);              // column=3 row=0
//        // Add radioButtons to the display gridePane
//        gridPane1.add(paneRB, 4, 1);
//        // SetOnAction For Hitter radioButton
//        rbHitter.setOnAction(e->{
//            if (rbHitter.isSelected()){
//                if (FxUtility.getYesNo("Hitter?", "Are you adding a Hitter?")){
//                    currentPlayer = new Hitter();
//                    tfHits = new TextField(((Hitter) currentPlayer).getHits() + "");
//                    gridPane1.add(new Label("Hits:"), 0, 2);      // column=0 row=2
//                    gridPane1.add(tfHits,1,2);                    // column=1 row=2
//                    tfAB = new TextField(((Hitter)currentPlayer).getAtBats()+"");
//                    gridPane1.add(new Label("AtBats:"), 0, 3);// column=0 row=3
//                    gridPane1.add(tfAB,1,3);                // column=1 row=3
//                    rbHitter.setDisable(false);
//                    rbHitter.setSelected(true);
//                    rbPitcher.setDisable(true);
//                    tfHits.setEditable(true);
//                    tfAB.setEditable(true);
//                }
//            }
//        });
//        // setOnAction for pitcher
//        rbPitcher.setOnAction(e->{
//            if (rbPitcher.isSelected()){
//                if (FxUtility.getYesNo("Pitcher?", "Are you adding a Hitter?")){
//                    currentPlayer = new Pitcher();
//                    tfER = new TextField(((Pitcher) currentPlayer).getEarnedRuns() + "");
//                    gridPane1.add(new Label("EarnedRuns:"), 0, 2);      // column=0 row=2
//                    gridPane1.add(tfER,1,2);                    // column=1 row=2
//                    tfIP = new TextField(((Pitcher)currentPlayer).getInningsPitched()+"");
//                    gridPane1.add(new Label("InningsPitched:"), 0, 3);// column=0 row=3
//                    gridPane1.add(tfIP,1,3);                // column=1 row=3
//                    rbPitcher.setDisable(false);
//                    rbPitcher.setSelected(true);
//                    rbHitter.setDisable(true);
//                    tfER.setEditable(true);
//                    tfIP.setEditable(true);
//                }
//            }
//        });
//        Button btAdd = new Button("Add");
//        Button btViewStack = new Button("View");
//        FlowPane flowPane = new FlowPane();
//        flowPane.setAlignment(Pos.CENTER);
//        flowPane.getChildren().addAll(btAdd, btViewStack);
//        flowPane.setPadding(new Insets(0, 12, 20, 14));
//        flowPane.setHgap(10);
//        gridPane1.setPadding(new Insets(5, 5, 5, 5));
//
//        borderPane4 = new BorderPane();
//        borderPane4.setPadding(new Insets(5, 5, 5, 5));
//        borderPane4.setTop(gridPane1);
//        borderPane4.setCenter(flowPane);
//        borderPane4.setBottom(taData);
//
//        // Scene setup for hitter
//        Scene scene3 = new Scene(borderPane4);
//        Stage stage3 = new Stage();
//        stage3.setScene(scene3);
//        stage3.setWidth(610);
//        stage3.setHeight(420);
//        stage3.show();
//        // meant to add a player to the text area debating on weather to use an outstreams and see if I can send the data there thern return it and display it to the text area
//        btAdd.setOnAction(e->{
//                String name = tfName.getText();
//                String pos = tfPos.getText();
//                if(disPlayer instanceof Hitter){
//                    int hits = Integer.parseInt(tfHits.getText());
//                    int atBats = Integer.parseInt(tfAB.getText());
//                    for (int i = 0; i < 10; i++) {
//                        batter = new Hitter(name, pos, hits, atBats);
//                        batterList = new Hitter[5];
//                        batterList[i] = batter;
//                    }
//                }
//                else if(disPlayer instanceof Pitcher){
//                    int er = Integer.parseInt(tfHits.getText());
//                    int ip = Integer.parseInt(tfAB.getText());
//                    new Pitcher(name, pos, er, ip);
//                }
//        });
//        btViewStack.setOnAction(e->{
//            if (disPlayer instanceof Hitter){
//                // Still working may change
//            }
//            else if (disPlayer instanceof Pitcher){
//                // Still working may change
//            }
//        });
    }// addPlayer


    //----------------------------------------------------------------------
    // method for displaying stats on a textArea
    private <E> void display(E[] a) {
        taData.setText(null);
        for (E t : a) {
            taData.appendText(t.toString() + "\n");
        }
    }// method


    private <E> void display5(E[] a) {
//        taData5.setText(null);
        for (E t : a) {
            taData5.appendText(t.toString() + "\n");
        }
    }// method

    //----------------------------------------------------------------------
    // List the hitters using list view with the hitters sorted
    // by there era and map the player based on there position.
    public void listViewHittersMap() {
        // Set up the model which is two lists of Players and a filter criteria
        ReadOnlyObjectProperty<ObservableList<Player>> playersProperty =
                new SimpleObjectProperty<>(FXCollections.observableArrayList());

        ReadOnlyObjectProperty<FilteredList<Player>> viewablePlayersProperty =
                new SimpleObjectProperty<FilteredList<Player>>(
                        new FilteredList<>(playersProperty.get()));

        ObjectProperty<Predicate<? super Player>> filterProperty =
                viewablePlayersProperty.get().predicateProperty();
        // Build the UI
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(4);
        // new HBox
        HBox hbox = new HBox();
        hbox.setSpacing(2);

        ToggleGroup filterTG = new ToggleGroup();

        // The toggleHandler action wills set the filter based on the TB selected
        EventHandler<ActionEvent> toggleHandler = (event) -> {
            ToggleButton tb = (ToggleButton) event.getSource();
            Predicate<Player> filter = (Predicate<Player>) tb.getUserData();
            filterProperty.set(filter);
        };

        ToggleButton tbShowAll = new ToggleButton("Show All");
        tbShowAll.setSelected(true);
        tbShowAll.setToggleGroup(filterTG);
        tbShowAll.setOnAction(toggleHandler);
        tbShowAll.setUserData((Predicate<Player>) (Player p) -> true);

        // Create a distinct list of player positions from the Player objects, then create
        // ToggleButtons
        SortingUtility.mergeSort(hitters, new HitterAverageComparator());
        List<ToggleButton> tbs = Arrays.stream(hitters)
                .map(Player::getPosition)
                .distinct()
                .map((name) -> {
                    ToggleButton tb = new ToggleButton(name);
                    tb.setToggleGroup(filterTG);
                    tb.setOnAction(toggleHandler);
                    tb.setUserData((Predicate<Player>) (Player p) -> name.equals(p.getPosition()));
                    return tb;
                }).toList();

        hbox.getChildren().add(tbShowAll);
        hbox.getChildren().addAll(tbs);

        // Create a ListView bound to the viewablePlayers property
        ListView<Player> lv = new ListView<>();
        lv.itemsProperty().bind(viewablePlayersProperty);

        vbox.getChildren().addAll(hbox, lv);
        // set up scene and stage
        Scene scene = new Scene(vbox);
        Stage stage4 = new Stage();
        stage4.setScene(scene);
        stage4.setOnShown((evt) -> {
            playersProperty.get().addAll(hitters);
        });

        stage4.show();
    } //listHitterMapViewMap()

    //----------------------------------------------------------------------
    public void listViewPitchersMap() {
        // Set up the model which is two lists of Players and a filter criteria
        ReadOnlyObjectProperty<ObservableList<Player>> playersProperty =
                new SimpleObjectProperty<>(FXCollections.observableArrayList());

        ReadOnlyObjectProperty<FilteredList<Player>> viewablePlayersProperty =
                new SimpleObjectProperty<FilteredList<Player>>(
                        new FilteredList<>(playersProperty.get()));

        ObjectProperty<Predicate<? super Player>> filterProperty =
                viewablePlayersProperty.get().predicateProperty();

        // Build the UI
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(4);

        HBox hbox = new HBox();
        hbox.setSpacing(2);

        ToggleGroup filterTG = new ToggleGroup();

        // The toggleHandler action wills set the filter based on the TB selected
        EventHandler<ActionEvent> toggleHandler = (event) -> {
            ToggleButton tb = (ToggleButton) event.getSource();
            Predicate<Player> filter = (Predicate<Player>) tb.getUserData();
            filterProperty.set(filter);
        };

        ToggleButton tbShowAll = new ToggleButton("Show All");
        tbShowAll.setSelected(true);
        tbShowAll.setToggleGroup(filterTG);
        tbShowAll.setOnAction(toggleHandler);
        tbShowAll.setUserData((Predicate<Player>) (Player p) -> true);

        // Create a distinct list of player positions from the Player objects, then create
        // ToggleButtons
        SortingUtility.mergeSort(pitchers, new ERAComparator());
        List<ToggleButton> tbs = Arrays.stream(pitchers)
                .map((p) -> p.getPosition())
                .distinct()
                .map((name) -> {
                    ToggleButton tb = new ToggleButton(name);
                    tb.setToggleGroup(filterTG);
                    tb.setOnAction(toggleHandler);
                    tb.setUserData((Predicate<Player>) (Player p) -> name.equals(p.getPosition()));
                    return tb;
                }).toList();

        hbox.getChildren().add(tbShowAll);
        hbox.getChildren().addAll(tbs);

        // Create a ListView bound to the viewablePlayers property
        ListView<Player> lv = new ListView<>();
        lv.itemsProperty().bind(viewablePlayersProperty);

        vbox.getChildren().addAll(hbox, lv);

        Scene scene = new Scene(vbox);
        Stage stage4 = new Stage();
        stage4.setScene(scene);
        stage4.setOnShown((evt) -> {
            playersProperty.get().addAll(pitchers);
        });
        stage4.show();
    } //listPitchersMapViewMap()

}// BaseballDriverFX (class)