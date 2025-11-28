public class ScratchBlock {
    public String opcode;
    public String fieldValue;

    public ScratchBlock(String opcode, String fieldValue) {
        this.opcode = opcode;
        this.fieldValue = fieldValue;
    }

    public String toJSON() {
        return "{ \"opcode\": \"" + opcode + "\", \"value\": \"" + fieldValue + "\" }";
    }
}
