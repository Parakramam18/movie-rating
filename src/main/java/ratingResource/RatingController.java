package ratingResource;
/*   RajUser created on 10/27/2019 
inside the package - ratingResource  */

import model.RatingData;
import model.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @RequestMapping("/{movieID}")
    public UserRatings getRatings(@PathVariable("movieID") String movieID)
    {
//          return new RatingData(movieID,"7");
        List<RatingData> ratingDataList = Arrays.asList(new RatingData("1", "7"), new RatingData("2", "9"));
        UserRatings userRatings = new UserRatings();
        userRatings.setRatingDataList(ratingDataList);
        return userRatings;

    }
}
