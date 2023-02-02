package nextstep.exception;

public class RoomEscapeException extends RuntimeException {
    private ErrorCode errorCode;

    public RoomEscapeException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}