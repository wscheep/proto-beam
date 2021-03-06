package io.anemos.protobeam.convert;/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import com.google.protobuf.Descriptors;
import io.anemos.protobeam.examples.ProtoBeamBasicSpecial;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialTest extends AbstractProtoBigQueryTest {

    private ProtoTableRowExecutionPlan plan;


    @Before
    public void setup() {
        ProtoBeamBasicSpecial x = ProtoBeamBasicSpecial.newBuilder()
                .build();
        plan = new ProtoTableRowExecutionPlan(x);

        byte[] so = SerializeTest.serializeToByteArray(plan);
        plan = (ProtoTableRowExecutionPlan) SerializeTest.deserializeFromByteArray(so, "");
    }

    @Test
    public void testSchema() {
        ProtoBeamBasicSpecial x = ProtoBeamBasicSpecial.newBuilder().build();
        Descriptors.Descriptor descriptor = x.getDescriptorForType();

        String modelRef = "{fields=[" +
                                "{mode=REQUIRED, name=test_name, type=STRING}, " +
                                "{mode=REQUIRED, name=test_index, type=INT64}, " +
                                "{mode=REQUIRED, name=special_enum, type=STRING}, " +
                                "{mode=REPEATED, name=repeated_enum, type=STRING}, " +
                                "{mode=NULLABLE, name=oneof_int32, type=INT64}, " +
                                "{mode=NULLABLE, name=oneof_bool, type=BOOL}, " +
                                "{mode=NULLABLE, name=oneof_string, type=STRING}, " +
                                "{fields=[" +
                                    "{mode=REQUIRED, name=test_name, type=STRING}, " +
                                    "{mode=REQUIRED, name=test_index, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_double, type=FLOAT64}, " +
                                    "{mode=REQUIRED, name=primitive_float, type=FLOAT64}, " +
                                    "{mode=REQUIRED, name=primitive_int32, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_int64, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_uint32, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_uint64, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_sint32, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_sint64, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_fixed32, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_fixed64, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_sfixed32, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_sfixed64, type=INT64}, " +
                                    "{mode=REQUIRED, name=primitive_bool, type=BOOL}, " +
                                    "{mode=REQUIRED, name=primitive_string, type=STRING}, " +
                                    "{mode=REQUIRED, name=primitive_bytes, type=BYTES}" +
                                "], mode=NULLABLE, name=oneof_primitive, type=STRUCT}, " +
                                "{fields=[" +
                                    "{mode=REQUIRED, name=key, type=STRING}, " +
                                    "{mode=REQUIRED, name=value, type=INT64}" +
                                "], mode=REPEATED, name=x, type=STRUCT}, " +
                                "{fields=[" +
                                    "{mode=REQUIRED, name=key, type=STRING}, " +
                                    "{mode=REQUIRED, name=value, type=STRING}], " +
                                "mode=REPEATED, name=y, type=STRUCT}, " +
                                "{fields=[" +
                                    "{mode=REQUIRED, name=key, type=STRING}, " +
                                    "{fields=[" +
                                        "{mode=REQUIRED, name=test_name, type=STRING}, " +
                                        "{mode=REQUIRED, name=test_index, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_double, type=FLOAT64}, " +
                                        "{mode=REQUIRED, name=primitive_float, type=FLOAT64}, " +
                                        "{mode=REQUIRED, name=primitive_int32, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_int64, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_uint32, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_uint64, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_sint32, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_sint64, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_fixed32, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_fixed64, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_sfixed32, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_sfixed64, type=INT64}, " +
                                        "{mode=REQUIRED, name=primitive_bool, type=BOOL}, " +
                                        "{mode=REQUIRED, name=primitive_string, type=STRING}, " +
                                        "{mode=REQUIRED, name=primitive_bytes, type=BYTES}" +
                                    "], mode=NULLABLE, name=value, type=STRUCT}" +
                                "], mode=REPEATED, name=z, type=STRUCT}, " +
                                "{mode=NULLABLE, name=oneof_int64, type=INT64}, " +
                                "{mode=NULLABLE, name=oneof_double, type=FLOAT64}" +
                            "]}";
        SchemaProtoToBigQueryModel model = new SchemaProtoToBigQueryModel();
        assertEquals(modelRef, model.getSchema(descriptor).toString());

        String apiRef = "Schema{fields=[Field{name=test_name, type=STRING, mode=REQUIRED, description=null}, Field{name=test_index, type=INTEGER, mode=REQUIRED, description=null}, Field{name=special_enum, type=STRING, mode=REQUIRED, description=null}, Field{name=repeated_enum, type=STRING, mode=REPEATED, description=null}, Field{name=oneof_int32, type=INTEGER, mode=NULLABLE, description=null}, Field{name=oneof_bool, type=BOOLEAN, mode=NULLABLE, description=null}, Field{name=oneof_string, type=STRING, mode=NULLABLE, description=null}, Field{name=oneof_primitive, type=RECORD, mode=NULLABLE, description=null}, Field{name=x, type=RECORD, mode=REPEATED, description=null}, Field{name=y, type=RECORD, mode=REPEATED, description=null}, Field{name=z, type=RECORD, mode=REPEATED, description=null}, Field{name=oneof_int64, type=INTEGER, mode=NULLABLE, description=null}, Field{name=oneof_double, type=FLOAT, mode=NULLABLE, description=null}]}";
        SchemaProtoToBigQueryApi api = new SchemaProtoToBigQueryApi();
        assertEquals(apiRef, api.getSchema(descriptor).toString());

        String ddlRef = "CREATE TABLE `test` (\n" +
                "\t`test_name` STRING NOT NULL,\n" +
                "\t`test_index` INT64 NOT NULL,\n" +
                "\t`special_enum` STRING NOT NULL,\n" +
                "\t`repeated_enum` ARRAY<STRING>,\n" +
                "\t`oneof_int32` INT64,\n" +
                "\t`oneof_bool` BOOL,\n" +
                "\t`oneof_string` STRING,\n" +
                "\t`oneof_primitive` STRUCT<\n" +
                "\t\t`test_name` STRING NOT NULL,\n" +
                "\t\t`test_index` INT64 NOT NULL,\n" +
                "\t\t`primitive_double` FLOAT64 NOT NULL,\n" +
                "\t\t`primitive_float` FLOAT64 NOT NULL,\n" +
                "\t\t`primitive_int32` INT64 NOT NULL,\n" +
                "\t\t`primitive_int64` INT64 NOT NULL,\n" +
                "\t\t`primitive_uint32` INT64 NOT NULL,\n" +
                "\t\t`primitive_uint64` INT64 NOT NULL,\n" +
                "\t\t`primitive_sint32` INT64 NOT NULL,\n" +
                "\t\t`primitive_sint64` INT64 NOT NULL,\n" +
                "\t\t`primitive_fixed32` INT64 NOT NULL,\n" +
                "\t\t`primitive_fixed64` INT64 NOT NULL,\n" +
                "\t\t`primitive_sfixed32` INT64 NOT NULL,\n" +
                "\t\t`primitive_sfixed64` INT64 NOT NULL,\n" +
                "\t\t`primitive_bool` BOOL NOT NULL,\n" +
                "\t\t`primitive_string` STRING NOT NULL,\n" +
                "\t\t`primitive_bytes` BYTES NOT NULL\n" +
                "\t>,\n" +
                "\t`x` ARRAY<\n" +
                "\t\tSTRUCT<\n" +
                "\t\t\t`key` STRING NOT NULL,\n" +
                "\t\t\t`value` INT64 NOT NULL\n" +
                "\t\t>\n" +
                "\t>,\n" +
                "\t`y` ARRAY<\n" +
                "\t\tSTRUCT<\n" +
                "\t\t\t`key` STRING NOT NULL,\n" +
                "\t\t\t`value` STRING NOT NULL\n" +
                "\t\t>\n" +
                "\t>,\n" +
                "\t`z` ARRAY<\n" +
                "\t\tSTRUCT<\n" +
                "\t\t\t`key` STRING NOT NULL,\n" +
                "\t\t\t`value` STRUCT<\n" +
                "\t\t\t\t`test_name` STRING NOT NULL,\n" +
                "\t\t\t\t`test_index` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_double` FLOAT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_float` FLOAT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_int32` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_int64` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_uint32` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_uint64` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_sint32` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_sint64` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_fixed32` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_fixed64` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_sfixed32` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_sfixed64` INT64 NOT NULL,\n" +
                "\t\t\t\t`primitive_bool` BOOL NOT NULL,\n" +
                "\t\t\t\t`primitive_string` STRING NOT NULL,\n" +
                "\t\t\t\t`primitive_bytes` BYTES NOT NULL\n" +
                "\t\t\t>\n" +
                "\t\t>\n" +
                "\t>,\n" +
                "\t`oneof_int64` INT64,\n" +
                "\t`oneof_double` FLOAT64\n" +
                ")\n";
        SchemaProtoToBigQueryDDL ddl = new SchemaProtoToBigQueryDDL();
        assertEquals(ddlRef, ddl.getSchema(descriptor).setTableName("test").toString());

    }

    @Test
    public void enumValueFieldTest() {
        ProtoBeamBasicSpecial protoIn = ProtoBeamBasicSpecial.newBuilder()
                .setSpecialEnum(ProtoBeamBasicSpecial.EnumSpecial.BAR)
                .build();
        testPingPong(plan, protoIn);
    }

    @Test
    public void enumValueRepeatedTest() {
        ProtoBeamBasicSpecial protoIn = ProtoBeamBasicSpecial.newBuilder()
                .addRepeatedEnum(ProtoBeamBasicSpecial.EnumSpecial.FOO)
                .addRepeatedEnum(ProtoBeamBasicSpecial.EnumSpecial.BAR)
                .build();
        testPingPong(plan, protoIn);
    }

}
