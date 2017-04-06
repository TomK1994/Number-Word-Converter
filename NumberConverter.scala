//My initial idea was to use a hard-coded, or InputStreamReader-fed file, dictionary, with 99,999 number-word pairs. This would have been much simpler,
//especially had I been able to find such a dictionary pre-written online.

//However, it suffered the fatal flaw of being way too boring a solution (although extendible up to the capacity of a .txt file, without editing source code).
//Instead, here's a Word-String builder than takes an Integer as input and outputs a constructed word based on the input.
//The class functionality can easily be extended by adding methods for higher or lower orders of magnitude (in base10).

//Current errors to fix:

//Converter methods are called more times than needed

//Still to do:

//String concatenation method had to be changed, therefore the new method must be implemented (printing within ConvertToText,
//rather than the individual ConvertX methods'

class Converter() {
	
	//var ArraySize = ParseInput(max).length
	
	var digits = 0
	
	//var numberAsIntArray = Array[Int](ArraySize)
	
	def ConvertToText(number:Int) {
		
		var numberAsIntArray = ParseInput(number)
		
		var s = number.toString()
	
		digits = s.length()

		for (i <- 0 to digits) {
		
			if (digits == 0) {
			
				print("Nothing to translate")
			
			}
			
			if (digits == 1) {

				print(ConvertUnits(numberAsIntArray(0)))

			}
			
			else if (digits == 2 && number < 20) {
			
				if (numberAsIntArray(0) > 3) {
				
					print(ConvertUnits(numberAsIntArray(0)))
				
				}
				
				print(ConvertTeens(numberAsIntArray(1)))
				
			}
			
			else if (digits == 2 && number >= 20){
			
				print(ConvertTens(numberAsIntArray(1)))
				print(ConvertUnits(numberAsIntArray(0)))
			
			}
			
			else if (digits == 3) {
			  
				print(ConvertHundreds(numberAsIntArray(2)))
				print(ConvertTens(numberAsIntArray(1)))
				print(ConvertUnits(numberAsIntArray(0)))
				
			}
			
			else if (digits == 4) {
			  
				print(ConvertThousands(numberAsIntArray(3)))
				print(ConvertHundreds(numberAsIntArray(2)))
				print(ConvertTens(numberAsIntArray(1)))
				print(ConvertUnits(numberAsIntArray(0)))
				
			}
			
			else if (digits == 5) {
			  
				print(ConvertTenThousands(numberAsIntArray(4)))
				print(ConvertThousands(numberAsIntArray(3)))
				print(ConvertHundreds(numberAsIntArray(2)))
				print(ConvertTens(numberAsIntArray(1)))
				print(ConvertUnits(numberAsIntArray(0)))
				
			}
		//Extend as needed, mon capitaine
		}
		
		
	}

	def ParseInput(input:Int) : Array[Int] = {
	
		var splitIntToString = input.toString().split("")
		
		var intArray = splitIntToString.map(_.toInt)
		
		return intArray
		
	}

	def ConvertUnits(i:Int) : String = {
	
		//var i = numberAsIntArray(1)

		if (i == 0) {

			return ("Zero ")

		}

		if (i == 1) {

		   return ("One ")

		}

		if (i == 2) {

			return ("Two ")

		}

		if (i == 3) {

		   return ("Three ")

		}

		if (i == 4) {

		   return ("Four ")

		}

		if (i == 5) {

			return ("Five ")

		 }

		if (i == 6) {

		   return ("Six ")

		}

		if (i == 7) {

		   return ("Seven ")

		}

		if (i == 8) {

		   return ("Eight ")

		}
		if (i == 9) {

			return ("Nine ")

		}
		
		return("")
	}
  
	def ConvertTeens(i:Int) : String = {
	
		//var i = numberAsIntArray(2)
		
		if (i == 0) {
		
			return ("Ten ")
			
		}
		
		if (i == 1) {//Teens are dealt with here, hence the condition '==1' is testing if the input number is '11', not '1'
		
			return ("Eleven ")
		
		}
		
		if (i == 2) {
		
			return ("Twelve ")
		
		}
		
		if (i == 3) {
		
			return ("Thirteen ")
			
		}
		
		if (i == 4) {
			
			//print(ConvertTens())
			return ("teen ")
		
		}
		
		if (i == 5) {
			
			//print(ConvertTens())
			return ("teen ")
		
		}
		
		if (i == 6) {
			
			//print(ConvertTens())
			return ("teen ")
		
		}
		
		if (i == 7) {
			
			//print(ConvertTens())
			return ("teen ")
		
		}
		
		if (i == 8) {
			
			//print(ConvertTens())
			return ("teen ")
		
		}
		
		if (i == 9) {
			
			//print(ConvertTens())
			return ("teen ")
		
		}
		
		if (i == 0) {
		
			return("Ten ")
		
		}
		
		return("")
		
	}
		
	def ConvertTens(i:Int) : String = {
	
		//var i = numberAsIntArray(2)
	
		if (i == 2) {
			
			return("Twenty")
		
		}
		
		if (i == 3) {
			
			return("Thirty")
		
		}
		
		if (i == 4) {
			
			return("Fourty")
		
		}
		
		if (i == 5) {
			
			return("Fifty")
			
		}
		
		if (i == 6) {
			
			return("Sixty")
			
		}
		
		if (i == 7) {
			
			return("Seventy")
			
		}
		
		if (i == 8) {
			
			return("Eighty")
			
		}
		
		if (i == 9) {
			
			return("Ninety")
			
			
		
		}
		
		return("")
		//print(ConvertUnits())
		
	}

	def ConvertHundreds(i:Int) : String = {
		
		//var i = numberAsIntArray(3)
		
		var s = "Hundred"
		
		if (i == 1) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		if (i == 2) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		if (i == 3) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		if (i == 4) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		if (i == 5) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		if (i == 6) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		if (i == 7) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		if (i == 8) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		if (i == 9) {
			
			//print(ConvertTens())
			return(s)
		
		}
		
		return("")
		
	}

	def ConvertThousands(i:Int) : String = {
		
		//var i = numberAsIntArray(4)
		
		var s = "Thousand"
		
		if (i == 1) {
		
			return(s)
			
		
		}
		
		if (i == 2) {
		
			return(s)
			
		
		}
		
		if (i == 3) {
		
			return(s)
			
		
		}
		
		if (i == 4) {
		
			return(s)
			
		
		}
		
		if (i == 5) {
			
			return(s)
		
		}
		
		if (i == 6) {
		
			return(s)
			
		
		}
		
		if (i == 7) {
		
			return(s)
			
		
		}
		
		if (i == 8) {
		
			return(s)
			
		
		}
		
		if (i == 9) {
		
			return(s)
			
			
		
		}
		
		return("")
		//print(ConvertHundreds())
		
	}

	def ConvertTenThousands(i:Int) {

		

	}
	//Extend as needed, min kapten
}

var x = new Converter()

for (i <- 0 to 20) {
	
	x.ConvertToText(i)

}