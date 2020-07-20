package practice;

import java.util.function.Supplier;

class Company {
	String name;

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		Company c = new Company("Xoriant");

		// Calling getName() of c using lambda expression
		Supplier<String> lambda = () -> c.getName();
		System.out.println(lambda.get());

		System.out.println();

		// Supplier<String> reference = c::getName();;
		// System.out.println(reference.get());

		// Creating objects using lambda
		Supplier<Company> lambdaSupplier = () -> new Company("SAP");
		lambdaSupplier.get();

		// Creating objects using constructor references

		//Supplier<Company> referenceSupplier = Company("SAP")::new;
		//referenceSupplier.get();

	}

}
