package com.wangtiansoft.KingDarts.persistence.entity;

import com.wangtiansoft.KingDarts.persistence.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo extends BaseEntity {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 业务UUID
     */
    private String uuid;
    /**
     * appid
     */
    private String appid;
    /**
     * openId
     */
    private String openid;
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别 0/默认,1/男,2/女
     */
    private Integer gender;

    /**
     * 身份证号码
     */
    private String id_no;

    /**
     * 县 区
     */
    private String areas;

    /**
     * 城市
     */
    private String city;

    /**
     * 省份
     */
    private String province;

    /**
     * 国家
     */
    private String country;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 是否发布 0/未发布,1/发布
     */
    private Integer is_publish;

    /**
     * 是否删除 0/未删除,1/删除
     */
    private Integer is_delete;

    /**
     * 总金额
     */
    private BigDecimal amount;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 赠送金额（余额）
     */
    private BigDecimal give_balance;

    /**
     * 使用优惠券后的金额（余额）
     */
    private BigDecimal coupon_balance;

    /**
     * 冻结金额
     */
    private BigDecimal frozen;

    /**
     * 用户积分
     */
    private Integer points;

    /**
     * 微信联合ID
     */
    private String unionid;

    /**
     * 头像地址
     */
    private String headimgurl;

    /**
     * 版本，用于乐观锁
     */
    private Integer version;

    //视频上一次时间

    private Date video_time;
}
