package cn.iocoder.yudao.module.system.convert.social;

import cn.iocoder.yudao.module.system.api.social.dto.SocialUserBindReqDTO;
import cn.iocoder.yudao.module.system.controller.admin.socail.vo.user.SocialUserBindReqVO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-25T21:06:10+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.2 (Eclipse Adoptium)"
)
public class SocialUserConvertImpl implements SocialUserConvert {

    @Override
    public SocialUserBindReqDTO convert(Long userId, Integer userType, SocialUserBindReqVO reqVO) {
        if ( userId == null && userType == null && reqVO == null ) {
            return null;
        }

        SocialUserBindReqDTO socialUserBindReqDTO = new SocialUserBindReqDTO();

        if ( reqVO != null ) {
            socialUserBindReqDTO.setSocialType( reqVO.getType() );
            socialUserBindReqDTO.setCode( reqVO.getCode() );
            socialUserBindReqDTO.setState( reqVO.getState() );
        }
        socialUserBindReqDTO.setUserId( userId );
        socialUserBindReqDTO.setUserType( userType );

        return socialUserBindReqDTO;
    }
}
