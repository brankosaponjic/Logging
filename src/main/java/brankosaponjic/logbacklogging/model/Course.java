package brankosaponjic.logbacklogging.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private String name;
    private int chapterCount;
}