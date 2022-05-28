package travelagency.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import travelagency.domain.enums.Destination;

import java.util.List;

@Data
@NoArgsConstructor
public class Program {
    private Integer id;
    private String name;
    private Destination city;
    private String description;
    private double price;
    private String guide;
    private List<Traveller> participants;
    private double minimumNumberOfParticipants;
    private double maximumNumberOfParticipants;
}
