import java.util.ArrayList;
import java.util.List;

public class VRController {
    private List<Customer> customers;

    private List<Video> videos;

    public VRController(List<Customer> customers, List<Video> videos) {
        this.customers = customers;
        this.videos = videos;
    }

    public List<Customer> getCustomerList() {
        return customers;
    }

    public List<Video> getVideoList() {
        return videos;
    }

    Customer getCustomer(String customerName) {
        for ( Customer customer: getCustomerList()) {
            if ( customer.getName().equals(customerName)) {
                return customer ;
            }
        }
        return null;
    }

    Video getVideo(String videoTitle) {
        for ( Video video: getVideoList() ) {
            if ( video.getTitle().equals(videoTitle) && video.isRented() == false ) {
                return video;
            }
        }
        return null;
    }
}
