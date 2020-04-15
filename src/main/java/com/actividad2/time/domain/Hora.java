package com.actividad2.time.domain;

import com.actividad2.common.Preconditions;
import lombok.Value;


@Value(staticConstructor = "of")
public class Hora {
    int value;

    private Hora(int value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value>=0 && value<=23);
        //Preconditions.checkArgument(StringUtils.isNoneBlank(value));
        this.value=value;
    }


}
