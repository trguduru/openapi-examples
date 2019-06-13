package io.tguduru.openapi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.tguduru.openapi.model.Pet;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class Pets   {
  
  private @Valid List<Pet> pet = new ArrayList<Pet>();

  /**
   * an array of pets
   **/
  public Pets pet(List<Pet> pet) {
    this.pet = pet;
    return this;
  }

  
  @ApiModelProperty(value = "an array of pets")
  @JsonProperty("pet")
 @Size(max=100)  public List<Pet> getPet() {
    return pet;
  }
  public void setPet(List<Pet> pet) {
    this.pet = pet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pets pets = (Pets) o;
    return Objects.equals(this.pet, pets.pet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pets {\n");
    
    sb.append("    pet: ").append(toIndentedString(pet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

