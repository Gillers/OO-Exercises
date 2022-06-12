package com.version1

public class customer {
    // Instance variables to hold customer's name and account number
    private String name;
    private int accountNumber;

    private String status;

    // ToDo:
        //
        20	// Provide a class variable for last-used account number
        21
        22
        23	//
        24	// Constructor that takes a String to initialise the instance variable for the customer's
        25	// name, and sets the status automatically to 'A' as a default value
        26	//
        27	public Customer(String name)
28	{
            29		this.name = name;
            30
            31		//
            32		// ToDo:
            33		//
            34		//
            35		// Initialise status to  'A'
            36
            37
            38	}
39
        40	// ToDo: set the account number automatically, by incrementing the class variable
        41	// holding the last used account number. BOTH constructors must do this. Remember one
        42	// constructor can invoke the other using "this"...For an elegant solution, feel free
        43	// to change the contents of the first constructor that's been provided here...
        44	//
        45
        46
        47
        48
        49
        50
        51
        52	//
        53	// ToDo:
        54	//
        55	//
        56	// Provide a second constructor that takes a String and a char, the customer's name and status
        57	//
        58
        59
        60	//
        61	// The getName method returns the name
        62	//
        63    public String getName()
64    {
            65		return name;
            66	}
67
        68
        69	//
        70	// The getAccountNumber method returns the accountNumber
        71	//
        72    public int getAccountNumber()
73    {
            74		return accountNumber;
            75	}
76
        77
        78	//
        79	// ToDo:
        80	//
        81	// Provide a getStatus method to return the status
        82	//
        83
        84
        85
        86	//
        87	// ToDo:
        88	//
        89	// Provide a isHeld method that returns a boolean: true if the customer is status 'H' for on-hold,
        90	// otherwise it returns false
        91	//
        92
        93
        94
        95
        96	//
        97	// This changeDetails method changes the name
        98	//
        99    public void changeDetails(String name)
100    {
            101		this.name = name;
            102	}
103
        104
        105	//
        106	// ToDo:
        107	//
        108	// Provide a second changeDetails method that changes the name and status
        109	//
        110
        111
        112
        113	//
        114	// ToDo:
        115	//
        116	// Provide a class method, setLastUsedAccountNumber(), to reset the class variable
        117	//
        118
        119
        120
        121
}
