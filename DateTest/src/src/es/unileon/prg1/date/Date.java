package src.es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		
		switch (this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day<1 || day>31){
					throw new DateException("Error. Fecha no valida. Dia "+day+" no valido en el mes "+month+".");
				}
				else{
						this.day=day;
				}

				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day<1 || day>30){
					throw new DateException("Error. Fecha no valida. Dia "+day+" no valido en el mes "+month+".");
				}
				else{
						this.day=day;
				}

				break;
			case 2:
				if(day<1 || day>28){
					throw new DateException("Error. Fecha no valida. Dia "+day+" no valido en el mes "+month+".");
				}
				else{
						this.day=day;
				}

				break;
		}

	}
	
	public int getYear(){
		return this.year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public void setMonth(int month){
		this.month = month;
	}

	public int getDay(){
		return this.day;
	}
	
	public void setDay(int day){
		this.day = day;
	}

	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}

	boolean isSameMonth(Date another){
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}
	
	boolean isSameDay(Date another){
		if ( this.day == another.getDay() ){
			return true;
		}
		return false;
	}
	
	boolean isSame(Date another){
		if ((this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear())){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	public String getMonthName(){
		String month = null;
		switch(this.month){
			case 1:
				month = "Enero";
				break;
			case 2:
				month = "Febrero";
				break;
			case 3:
				month = "Marzo";
				break;
			case 4:
				month = "Abril";
				break;
			case 5:
				month = "Mayo";
				break;
			case 6:
				month = "Junio";
				break;
			case 7:
				month = "Julio";
				break;
			case 8:
				month = "Agosto";
				break;
			case 9:
				month = "Septiembre";
				break;
			case 10:
				month = "Octubre";
				break;
			case 11:
				month = "Noviembre";
				break;
			case 12:
				month = "Diciembre";
				break;
			default:
				month = "No es un mes";
				break;
		}
		return month;
	}

	public boolean daysOfMonth(){
		boolean checkDay = false;
		if (this.day>0){
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(this.day <= 31){
					checkDay = true;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(this.day <= 30){
					checkDay = true;
				}
				break;
			case 2:
				if(this.day <= 28){
					checkDay = true;
				}
				break;
			default:
				checkDay = false;
		}
		}
		
		return checkDay;
	}

	public String getSeasonName(){
		String nameSeason = null;
		switch (this.month){
			case 12:
				if (this.day < 21){
					nameSeason = "Otonio";
				}
				if (this.day > 20){
					nameSeason = "Invierno";
				}
				break;
			case 1:
			case 2:
				nameSeason = "Invierno";
				break;
			case 3:
				if (this.day < 20){
					nameSeason = "Invierno";
				}
				if (this.day > 19){
					nameSeason = "Primavera";
				}
				break;
			case 4:
			case 5:
				nameSeason = "Primavera";
				break;
			case 6:
				if (this.day < 21){
					nameSeason = "Primavera";
				}
				if (this.day > 20){
					nameSeason= "Verano";
				}
				break;
			case 7:
			case 8:
				nameSeason = "Verano";
			case 9:
				if (this.day < 21){
					nameSeason = "Verano";
				}
				if (this.day > 20){
					nameSeason= "Otoñio";
				}
				break;
			case 10:
			case 11:
				nameSeason = "Otonio";
		}
		return nameSeason;
	}

	public String getMonthsLeft(){
		
		StringBuilder months = new StringBuilder();
		this.month = this.month + 1;
		for(int i = this.month; i<=12; i++){
			months.append(this.getMonthName() +" ");
			this.month=this.month + 1;
		}
		return months.toString();
	}

	public int maxDays(){
		int max = 0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				max = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				max = 30;
				break;
			case 2:
				max = 28;
				break;
			default:
				max = 100;
				break;
		}
		return max;
	}

	public String getDaysLeftOfMonth(){
		
		StringBuilder day = new StringBuilder();
		this.day = this.day+1;
		for(int i = this.day; i <= maxDays(); i++){
			day.append(toString() +" ");
			this.day=this.day+1;
		}
		return day.toString();
	}
	
	public String getMonthsSameDays(){
		String month = null;
			switch(this.month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					month="Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					month="Abril, Junio, Septiembre, Noviembre";
					break;
				case 2:
					month="Febrero";
					break;
				default:
					break;
			}
	return month;
	}

	public int daysPast(){
		int max=0, aux=0;
		for(int i=1; i < this.month; i++){
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					max = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					max = 30;
					break;
				case 2:
					max = 28;
					break;
				default:
					break;
			}
			aux = max + aux;
			
		}
		aux = aux + this.day;
		return aux;
	}

	
	
	public int numRandomTriesEqualDate(){
		int day=0, month=0, i=0;
		do{
			i++;
			month = (int) (Math.random()*12)+1;
			day = (int) (Math.random()*maxDays())+1;	
		}while(!(day == this.day) || !(month == this.month));
		return i;
	}

	/*public int numRandomTriesEqualDate(){
		int day=0, month=0, i=0;
		while(!(day == this.day) || !(month == this.month)){
			i++;
			month = (int) (Math.random()*12)+1;
			day = (int) (Math.random()*maxDays())+1;	
		}
		return i;
	}*/

	public String dayOfWeek(){
		String dayWeek = null;
		switch(daysPast()%7){
			case 1:
				dayWeek = "Lunes";
				break;
			case 2:
				dayWeek = "Martes";
				break;
			case 3:
				dayWeek = "Miercoles";
				break;
			case 4:
				dayWeek = "Jueves";
				break;
			case 5:
				dayWeek = "Viernes";
				break;
			case 6:
				dayWeek = "Sabado";
				break;
			case 0:
				dayWeek = "Domingo";
				break;
		}
		return dayWeek;
	}
}
