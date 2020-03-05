package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;



public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L,"Bob Zip","Seoul");
        assertThat(restaurant.getId(),is(1004L));
        assertThat(restaurant.getName() , is("Bob Zip")); //단정문
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant(1004L,"Bob Zip","Seoul");

        assertThat(restaurant.getInformation(),is("Bob Zip in Seoul"));
    }

}