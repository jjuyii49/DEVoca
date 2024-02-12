import { localAxios } from '@/util/http-commons'

const local = localAxios()

export function getMyCard(param, success, fail) {
    local.get(`/mypage/mycard/${param}`, {
        headers: {
            token: JSON.parse(localStorage.getItem('user')).kakaoUserInfo.token
        }
    }).then(success).catch(fail)
}
