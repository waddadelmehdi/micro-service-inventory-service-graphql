package ma.wem.inventoryservice;

import ma.wem.inventoryservice.dao.entities.Creator;
import ma.wem.inventoryservice.dao.entities.Video;
import ma.wem.inventoryservice.dao.repositories.CreatorRepository;
import ma.wem.inventoryservice.dao.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    <list>
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository){
        return args -> {
            Creator creator1 = new Creator(null, "Adam", "adam@wem.com", null);
            Creator creator2 = new Creator(null, "Sara", "sara@wem.com", null);
            Creator creator3 = new Creator(null, "Karim", "karim@wem.com", null);

            // Step 2: Save Creators first to assign them IDs
            creatorRepository.saveAll(Arrays.asList(creator1, creator2, creator3));

            // Step 3: Now create Video instances with references to saved Creator objects
            Video video1 = new Video(null, "video1", "https://wem.com/video1", "video1 wem", new Date(), creator1);
            Video video2 = new Video(null, "video2", "https://wem.com/video2", "video2 wem", new Date(), creator2);
            Video video3 = new Video(null, "video3", "https://wem.com/video3", "video3 wem", new Date(), creator3);

            // Step 4: Save the Video instances
            videoRepository.saveAll(Arrays.asList(video1, video2, video3));

            // Step 5: Update each Creator's list of Videos if needed
            creator1.setVideos(Arrays.asList(video1));
            creator2.setVideos(Arrays.asList(video2));
            creator3.setVideos(Arrays.asList(video3));

            // Optionally save the updated Creators again if the bidirectional relationship is required
            creatorRepository.saveAll(Arrays.asList(creator1, creator2, creator3));


        };
    }
}
