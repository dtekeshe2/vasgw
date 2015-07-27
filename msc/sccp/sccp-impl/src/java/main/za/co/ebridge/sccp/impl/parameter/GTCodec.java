package za.co.ebridge.sccp.impl.parameter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import za.co.ebridge.sccp.api.indicator.GlobalTitleIndicator;
import za.co.ebridge.sccp.api.parameter.GT0001;
import za.co.ebridge.sccp.api.parameter.GT0010;
import za.co.ebridge.sccp.api.parameter.GT0011;
import za.co.ebridge.sccp.api.parameter.GT0100;
import za.co.ebridge.sccp.api.parameter.GlobalTitle;

public class GTCodec {
    private static GTCodec getCodec(GlobalTitle gt) {
        switch (gt.getIndicator()) {
            case GLOBAL_TITLE_INCLUDES_NATURE_OF_ADDRESS_INDICATOR_ONLY:
                return new GT0001Codec((GT0001) gt);
            case GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_ONLY:
                return new GT0010Codec((GT0010) gt);
            case GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_AND_ENCODING_SCHEME:
                return new GT0011Codec((GT0011) gt);
            case GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_ENCODING_SCHEME_AND_NATURE_OF_ADDRESS:
                return new GT0100Codec((GT0100) gt);
            default:
                return null;
        }
    }

    public static void encode(GlobalTitle gt, OutputStream out) throws IOException {
        GTCodec codec = getCodec(gt);
        codec.encode(out);
    }

    public static GlobalTitle decode(GlobalTitleIndicator gti, InputStream in) throws IOException {
        GTCodec codec = null;
        switch (gti) {
            case GLOBAL_TITLE_INCLUDES_NATURE_OF_ADDRESS_INDICATOR_ONLY:
                codec = new GT0001Codec();
                break;
            case GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_ONLY:
                codec = new GT0010Codec();
                break;
            case GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_AND_ENCODING_SCHEME:
                codec = new GT0011Codec();
                break;
            case GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_ENCODING_SCHEME_AND_NATURE_OF_ADDRESS:
                codec = new GT0100Codec();
                break;
            case NO_GLOBAL_TITLE_INCLUDED:
                return null;
        }
        return codec.decode(in);
    }

    protected void encode(OutputStream out) throws IOException {
    }

    protected GlobalTitle decode(InputStream in) throws IOException {
        return null;
    }
}
