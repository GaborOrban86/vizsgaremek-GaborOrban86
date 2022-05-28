package travelagency.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import travelagency.domain.enums.AccommodationType;
import travelagency.domain.enums.Nights;
import travelagency.domain.enums.Service;

@Data
@NoArgsConstructor
public class Accommodation {
    private Integer id;
    private AccommodationType type;
    private Nights nights;
    private Service service;
    private double price;
}
