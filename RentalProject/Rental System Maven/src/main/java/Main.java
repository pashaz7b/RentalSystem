import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson(); // create a new Gson object
        Reader reader = new FileReader("C:\\Users\\WinSell\\Desktop\\maven fusk\\rentalMaven\\src\\test\\TestYourFork.json"); // open the input file
        AllModules allModulesList  = gson.fromJson(reader , new TypeToken<AllModules>() {
        }.getType());

        Customer joshn = allModulesList.getCustomers().get(0);
        Customer Emily = allModulesList.customers.get(1);
        Customer Brown = allModulesList.customers.get(2);
        RentalStore rentalStore = new RentalStore();


        for (Item tempItem : allModulesList.getBooks()) {
            if (tempItem.getId() == 3) {
                RentalStore.rentItem(tempItem, joshn);
            } else if (tempItem.getId() == 6) {
                RentalStore.rentItem(tempItem, joshn);
            }
        }

        for (Item tempItem : allModulesList.getBooks()) {
            if (tempItem.getId() == 1) {
                RentalStore.rentItem(tempItem, Emily);
            } else if (tempItem.getId() == 7) {
                RentalStore.rentItem(tempItem, Emily);
            }
        }

        for (Item tempItem : allModulesList.getBooks()) {
            if (tempItem.getId() == 9) {
                RentalStore.rentItem(tempItem, Brown);
            } else if (tempItem.getId() == 4) {
                RentalStore.rentItem(tempItem, Brown);
            }
        }

        reader.close();

        //write
        Gson writing = new Gson();
        String json = writing.toJson(allModulesList);
        String filePath ="C:\\Users\\WinSell\\Desktop\\maven fusk\\rentalMaven\\src\\test\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();
            System.out.println("JSON Data has been updated");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}

