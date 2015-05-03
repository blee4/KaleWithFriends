package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Consumer database to hold all the consumers.
 * Created by Amy on 4/12/2015.
 */


public class ConsumerDB {

  /**
   * The list that contains all the consumers.
   */
  public static Map<String, Consumer> consumerList = new HashMap<>();

  /**
   * Adds a consumer to the database.
   *
   * @param consumer the consumer.
   */
  public static void addConsumer(Consumer consumer) {
    consumerList.put(consumer.getName(), consumer);
  }

  /**
   * Gets a consumer given the id.
   *
   * @param name The consumer name.
   * @return The corresponding consumer.
   */
  public static Consumer getConsumer(String name) {
    return consumerList.get(name);
  }

  /**
   * Gets a list of all the consumers.
   *
   * @return The list of consumers.
   */
  public static ArrayList<Consumer> getConsumers() { return new ArrayList(consumerList.values()); }


}
