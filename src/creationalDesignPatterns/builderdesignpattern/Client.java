package builderdesignpattern;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder userDTOBuilder = new UserWebDTOBuilder();
		UserDTO userDTO = directBuild(userDTOBuilder, user);
		System.out.println(userDTO);
	}

	private static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user) {
		return userDTOBuilder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).withBirthday(user.getBirthday()).withAddress(user
				.getAddress()).build();
	}

	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
