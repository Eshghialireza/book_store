package ir.mupra.book_store.payload.author;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AuthorPayload {
    String name;
    Date birthDay;
}
