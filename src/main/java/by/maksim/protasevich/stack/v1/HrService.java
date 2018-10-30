package by.maksim.protasevich.stack.v1;

public interface HrService {
    Response interview(Developer developer);

    Offer proposeAnOfferTo(Developer developer);
}
