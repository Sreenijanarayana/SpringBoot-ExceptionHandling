--> This project is to handle exceptions in spring boot application <--

-> In service method we check if we have recieved a student object or not, if null is recievd then we throw NoStudentFoundError.

  return repo.findById(id)
		.orElseThrow(() -> new NoStudentFoundError("Student with given id "+id+" is not present"));

-> create a NoStudentFoundError extends RuntimeException with constructor. This will show error in console
-> to print in the browser, we can create a class that @ControllerAdvice annotation 
ApiError{
public int errorCode;
	public String desc;
	public Date date;
 }

 -> Inside which we create methods that uses @ExceptionHandler annotation there we can specify the exception, these methods return appropriate status code and error message 
 @ControllerAdvice
 public class RestExceptionHandler {
    @ExceptionHandler(value = NoStudentFoundError.class)
	  public ResponseEntity<ApiError> handlestudentNotFound() {
		   ApiError error = new ApiError(400,"No Student Found",new Date());
		   return new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);
	  }

