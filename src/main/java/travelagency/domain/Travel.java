package travelagency.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import travelagency.domain.enums.Destination;

import java.util.List;

@Data
@NoArgsConstructor
public class Travel {
    private Integer id;
    private Destination destination;
    private List<Traveller> travellers;
    private double wholePrice;
}
