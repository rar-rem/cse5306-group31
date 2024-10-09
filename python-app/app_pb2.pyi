from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class AddRequest(_message.Message):
    __slots__ = ("number1", "number2")
    NUMBER1_FIELD_NUMBER: _ClassVar[int]
    NUMBER2_FIELD_NUMBER: _ClassVar[int]
    number1: int
    number2: int
    def __init__(self, number1: _Optional[int] = ..., number2: _Optional[int] = ...) -> None: ...

class AddReply(_message.Message):
    __slots__ = ("result",)
    RESULT_FIELD_NUMBER: _ClassVar[int]
    result: int
    def __init__(self, result: _Optional[int] = ...) -> None: ...
