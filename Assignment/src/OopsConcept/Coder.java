package OopsConcept;
class Coder extends Developer
{
	private String language ; 

	String getLanguage()
	{
		return language ;
	}

	void setLanguage ( String language )
	{
		this.language = language ;
	}

	Coder()
	{
	}

	Coder( String name , double salary ,String language )
	{
		super( name , salary ) ; 
		this.language = language ; 
	}

	void work()
	{
		System.out.println(name+" is working as a "+language+" "+Designation) ; 
		
	}

}
