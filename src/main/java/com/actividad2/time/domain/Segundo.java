package com.actividad2.time.domain;

import com.actividad2.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Segundo {
    int value;

    private Segundo(int value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value>=0 && value<=59);
        //Preconditions.checkArgument(StringUtils.isNoneBlank(value));
        this.value=value;
    }
}
