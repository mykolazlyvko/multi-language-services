package net.multi.language.common.message;

abstract class AbstractMessageType {
    abstract static class CommandMessage extends AbstractMessageType {
    }

    abstract static class QueryMessage extends AbstractMessageType {
    }

    abstract static class DomainEventMessage extends AbstractMessageType {
    }
}