package test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableVal.class)
@JsonDeserialize(as = ImmutableVal.class)
interface Val {
    int a();
    @JsonProperty("b") String second();
}
