public class MoodAnalysisException extends Exception
{
   enum ExceptiomType{
       ENTERED_NULL,ENTERED_EMPTY,NO_SUCH_FIELD,NO_SUCH_METHOD,NO_SUCH_CLASS,
       OBJECT_CREATION_ISSUE,METHOD_INVOCATION_ISSUE,FIELD_SETTING_ISSUE;
   }
   ExceptiomType type;

    public MoodAnalysisException( String message)
    {
        super(message);
    }


    public MoodAnalysisException(ExceptiomType type,String message)
    {
        super(message);
        this.type = type;

    }

    public MoodAnalysisException(ExceptiomType type,Throwable cause)
    {   super(cause);
        this.type = type;
    }

    public MoodAnalysisException(ExceptiomType type,Throwable cause,String message)
    {
        super(message,cause);
        this.type = type;
    }
}

