package com.shareprogramingPracticeJavaOOP.Exercise13.Utils.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseObject {
    private String status;
    private String msg;
    private Object data;
}
