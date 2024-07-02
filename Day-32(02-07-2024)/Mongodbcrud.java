package ojt.mongodbcrud;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class Mongodbcrud {
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "adit1";
    private static final String COLLECTION_NAME = "rvti";

    public static void createStud(String id, String name, int age, String place) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            Document stud = new Document("id", id)
                            .append("name", name)
                            .append("age", age)
                            .append("place", place);
            col.insertOne(stud);
            System.out.println("Student details created: " + stud.toJson());
        }
    }

    public static void readStud() {
        try (MongoClient mongoClient = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            FindIterable<Document> studs = collection.find();
            System.out.println("Stud details:");
            for (Document obj : studs) {
                System.out.println(obj.toJson());
            }
        }
    }

    public static void updateStud(String oldId, String newId) {
        try (MongoClient mongoClient = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
            collection.updateOne(Filters.eq("id", oldId), Updates.set("id", newId));
            System.out.println("Student id updated");
        }
    }

    public static void deleteStud(String id) {
        try (MongoClient mongoClient = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
            collection.deleteOne(Filters.eq("id", id));
            System.out.println("Student deleted with id: " + id);
        }
    }

    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create(CONNECTION_STRING);
        MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
        MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
        System.out.println("Connected to the database successfully");

        // Uncomment and adjust parameters as needed for testing
//         createStud("4", "Alice", 26, "TVM");
//         updateStud("4", "7");
         deleteStud("7");

        // Read all students after operations
        readStud();
    }
}  