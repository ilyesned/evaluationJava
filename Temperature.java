interface Comparable
{
	/*
	 * Retourne un nombre negatif si this < other, positif si this > other, 0 si
	 * this = other.
	 */
	public int compareTo(Comparable other);
}

public abstract class Temperature implements Comparable
{
	private double value;

	public double getValue()
	{
		// TODO à compléter
		return 0;
	}

	public String toString()
	{
		return "" + value;
	}

	public Temperature(double value)
	{
		this.value = value;
	}

	public abstract double enCelsius();

	public int compareTo(Comparable other)
	{
		// TODO à compléter
		return 0;
	}
}

class Celsius extends Temperature
{
	public Celsius(double value)
	{
		super(value);
	}

	public Celsius(Temperature t)
	{
		this(t.enCelsius());
	}

	public double enCelsius()
	{
		return getValue();
	}

	public String toString()
	{
		return super.toString() + " degrés Celsius";
	}
}

class Kelvin extends Temperature
{
	public Kelvin(double value)
	{
		super(value);
	}

	public Kelvin(Temperature t)
	{
		this(t.enCelsius() + 273);
	}

	public double enCelsius()
	{
		// TODO à compléter
		return 0;
	}

	public String toString()
	{
		return super.toString() + " degrés Kelvin";
	}
}

class Farenheit extends Temperature
{
	public Farenheit(double value)
	{
		super(value);
	}

	public Farenheit(Temperature t)
	{
		// TODO à compléter
		super(0);
	}

	public double enCelsius()
	{
		// TODO à compléter
		return 0;
	}

	public String toString()
	{
		// TODO à compléter
		return null;
	}
}
